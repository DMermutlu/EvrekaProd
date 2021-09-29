package base;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.table.TableRowSorter;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public  class SendMail {

    public static void sendMail() throws Exception {



/// Recipient's email ID needs to be mentioned.
//        String to = "dogukanmermutlu@gmail.com";


        String[] mailToId = {"dogukanmermutlu@gmail.com", "dogukanmer@gmail.com", "dogukanmermutlu@hotmail.com"};



        // Sender's email ID needs to be mentioned
        String from = "dogukanmermutlu@evreka.co";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass
        Session session = Session.getInstance(properties, new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("dogukanmermutlu@evreka.co", "Dogukanmer305181");

            }

        });

        //session.setDebug(true);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            for (int i = 0; i < mailToId.length; i++){
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailToId[i]));
            }

            //            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to1));

            // Set Subject: header field
            message.setSubject("EVREKA - Automation Test Results");

            Multipart multipart = new MimeMultipart();

            MimeBodyPart attachmentPart = new MimeBodyPart();

            MimeBodyPart textPart = new MimeBodyPart();

            try {

                File f = new File("/Users/dogukanmermutlu/IdeaProjects/EvrekaProd/test-output/emailable-report.html");

                attachmentPart.attachFile(f);
                textPart.setText("Automation test results in the prod environment are attached.");
                multipart.addBodyPart(textPart);
                multipart.addBodyPart(attachmentPart);

            } catch (IOException e) {

                e.printStackTrace();

            }

            message.setContent(multipart);

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }


}


