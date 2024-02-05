/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SendData;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class SendMail {

    final String fromEmail = "thanhpqce171732@fpt.edu.vn";
    final String password = "gbtl dqnu hobr wunt";

    public void sendCode(String toEmail, String resetLink, String fullName) {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        properties.put("mail.smtp.port", "587"); //TSL 587, SSL 465
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session session = Session.getInstance(properties, auth);
        //Send email
        MimeMessage message = new MimeMessage(session);
        try {
            // Subject
            message.setSubject("Reset Your Password.");
            // TextText          
            String htmlContent = "    <!doctype html>\n"
                            + "    <html>\n"
                            + "\n"
                            + "    <head>\n"
                            + "        <meta charset='utf-8'>\n"
                            + "        <meta name='viewport' content='width=device-width, initial-scale=1'>\n"
                            + "        <title>Snippet - GoSNippets</title>\n"
                            + "        <link href='https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css' rel='stylesheet'>\n"
                            + "        <link href='' rel='stylesheet'>\n"
                            + "        <style>\n"
                            + "            @media screen {\n"
                            + "                @font-face {\n"
                            + "                    font-family: 'Lato';\n"
                            + "                    font-style: normal;\n"
                            + "                    font-weight: 400;\n"
                            + "                    src: local('Lato Regular'), local('Lato-Regular'), url(https://fonts.gstatic.com/s/lato/v11/qIIYRU-oROkIk8vfvxw6QvesZW2xOQ-xsNqO47m55DA.woff) format('woff');\n"
                            + "                }\n"
                            + "\n"
                            + "                @font-face {\n"
                            + "                    font-family: 'Lato';\n"
                            + "                    font-style: normal;\n"
                            + "                    font-weight: 700;\n"
                            + "                    src: local('Lato Bold'), local('Lato-Bold'), url(https://fonts.gstatic.com/s/lato/v11/qdgUG4U09HnJwhYI-uK18wLUuEpTyoUstqEm5AMlJo4.woff) format('woff');\n"
                            + "                }\n"
                            + "\n"
                            + "                @font-face {\n"
                            + "                    font-family: 'Lato';\n"
                            + "                    font-style: italic;\n"
                            + "                    font-weight: 400;\n"
                            + "                    src: local('Lato Italic'), local('Lato-Italic'), url(https://fonts.gstatic.com/s/lato/v11/RYyZNoeFgb0l7W3Vu1aSWOvvDin1pK8aKteLpeZ5c0A.woff) format('woff');\n"
                            + "                }\n"
                            + "\n"
                            + "                @font-face {\n"
                            + "                    font-family: 'Lato';\n"
                            + "                    font-style: italic;\n"
                            + "                    font-weight: 700;\n"
                            + "                    src: local('Lato Bold Italic'), local('Lato-BoldItalic'), url(https://fonts.gstatic.com/s/lato/v11/HkF_qI1x_noxlxhrhMQYELO3LdcAZYWl9Si6vvxL-qU.woff) format('woff');\n"
                            + "                }\n"
                            + "            }\n"
                            + "\n"
                            + "            /* CLIENT-SPECIFIC STYLES */\n"
                            + "            body,\n"
                            + "            table,\n"
                            + "            td,\n"
                            + "            a {\n"
                            + "                -webkit-text-size-adjust: 100%;\n"
                            + "                -ms-text-size-adjust: 100%;\n"
                            + "            }\n"
                            + "\n"
                            + "            table,\n"
                            + "            td {\n"
                            + "                mso-table-lspace: 0pt;\n"
                            + "                mso-table-rspace: 0pt;\n"
                            + "            }\n"
                            + "\n"
                            + "            img {\n"
                            + "                -ms-interpolation-mode: bicubic;\n"
                            + "            }\n"
                            + "\n"
                            + "            /* RESET STYLES */\n"
                            + "            img {\n"
                            + "                border: 0;\n"
                            + "                height: auto;\n"
                            + "                line-height: 100%;\n"
                            + "                outline: none;\n"
                            + "                text-decoration: none;\n"
                            + "            }\n"
                            + "\n"
                            + "            table {\n"
                            + "                border-collapse: collapse !important;\n"
                            + "            }\n"
                            + "\n"
                            + "            body {\n"
                            + "                height: 100% !important;\n"
                            + "                margin: 0 !important;\n"
                            + "                padding: 0 !important;\n"
                            + "                width: 100% !important;\n"
                            + "                background-color: #f4f4f4;\n"
                            + "            }\n"
                            + "\n"
                            + "            /* iOS BLUE LINKS */\n"
                            + "            a[x-apple-data-detectors] {\n"
                            + "                color: inherit !important;\n"
                            + "                text-decoration: none !important;\n"
                            + "                font-size: inherit !important;\n"
                            + "                font-family: inherit !important;\n"
                            + "                font-weight: inherit !important;\n"
                            + "                line-height: inherit !important;\n"
                            + "            }\n"
                            + "\n"
                            + "            /* MOBILE STYLES */\n"
                            + "            @media screen and (max-width:600px) {\n"
                            + "                h1 {\n"
                            + "                    font-size: 32px !important;\n"
                            + "                    line-height: 32px !important;\n"
                            + "                }\n"
                            + "            }\n"
                            + "\n"
                            + "            /* ANDROID CENTER FIX */\n"
                            + "            div[style*=\"margin: 16px 0;\"] {\n"
                            + "                margin: 0 !important;\n"
                            + "            }\n"
                            + "        </style>\n"
                            + "        <script type='text/javascript' src=''></script>\n"
                            + "        <script type='text/javascript' src='https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js'></script>\n"
                            + "        <script type='text/javascript'\n"
                            + "            src='https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js'></script>\n"
                            + "    </head>\n"
                            + "\n"
                            + "    <body oncontextmenu='return false' class='snippet-body'>\n"
                            + "        <div\n"
                            + "            style=\"display: none; font-size: 1px; color: #fefefe; line-height: 1px; font-family: 'Lato', Helvetica, Arial, sans-serif; max-height: 0px; max-width: 0px; opacity: 0; overflow: hidden;\">\n"
                            + "            We're thrilled to have you here! Get ready to dive into your new account. </div>\n"
                            + "        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n"
                            + "            <!-- LOGO -->\n"
                            + "            <tr>\n"
                            + "                <td bgcolor=\"#FFA73B\" align=\"center\">\n"
                            + "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 600px;\">\n"
                            + "                        <tr>\n"
                            + "                            <td align=\"center\" valign=\"top\" style=\"padding: 40px 10px 40px 10px;\"> </td>\n"
                            + "                        </tr>\n"
                            + "                    </table>\n"
                            + "                </td>\n"
                            + "            </tr>\n"
                            + "            <tr>\n"
                            + "                <td bgcolor=\"#FFA73B\" align=\"center\" style=\"padding: 0px 10px 0px 10px;\">\n"
                            + "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 600px;\">\n"
                            + "                        <tr>\n"
                            + "                            <td bgcolor=\"#ffffff\" align=\"center\" valign=\"top\"\n"
                            + "                                style=\"padding: 40px 20px 20px 20px; border-radius: 4px 4px 0px 0px; color: #111111; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 48px; font-weight: 400; letter-spacing: 4px; line-height: 48px;\">\n"
                            + "                                <h1 style=\"font-size: 48px; font-weight: 400; margin: 2;\">Welcome!</h1> <img\n"
                            + "                                    src=\" https://img.icons8.com/clouds/100/000000/handshake.png\" width=\"125\" height=\"120\"\n"
                            + "                                    style=\"display: block; border: 0px;\" />\n"
                            + "                            </td>\n"
                            + "                        </tr>\n"
                            + "                    </table>\n"
                            + "                </td>\n"
                            + "            </tr>\n"
                            + "            <tr>\n"
                            + "                <td bgcolor=\"#f4f4f4\" align=\"center\" style=\"padding: 0px 10px 0px 10px;\">\n"
                            + "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 600px;\">\n"
                            + "                        <tr>\n"
                            + "                            <td bgcolor=\"#ffffff\" align=\"left\"\n"
                            + "                                style=\"padding: 20px 30px 40px 30px; color: #666666; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 18px; font-weight: 400; line-height: 25px;\">\n"
                            + "                            <h5 style=\"font-style: italic;\">Hello,  " + fullName + "</h5>\n"
                            + "                                <p style=\"margin: 0;\">We're excited to have you get started. First, you need change pass\n"
                            + "                                    account. Just click the button below.</p>\n"
                            + "                            </td>\n"
                            + "                        </tr>\n"
                            + "                        <tr>\n"
                            + "                            <td bgcolor=\"#ffffff\" align=\"left\">\n"
                            + "                                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n"
                            + "                                    <tr>\n"
                            + "                                        <td bgcolor=\"#ffffff\" align=\"center\" style=\"padding: 20px 30px 60px 30px;\">\n"
                            + "                                            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n"
                            + "                                                <tr>\n"
                            + "                                                    <td align=\"center\" style=\"border-radius: 3px;\" bgcolor=\"#FFA73B\"><a\n"
                            + "                                                           href=\"" + resetLink + "\"\n"
                            + "                                                            style=\"font-size: 25px; font-family: Helvetica, Arial, sans-serif; color: #ffffff; text-decoration: none; color: #ffffff; text-decoration: none; padding: 10px 20px; border-radius: 2px; border: 1px solid #FFA73B; display: inline-block;\">Rest\n"
                            + "                                                            Password</a></td>\n"
                            + "                                                </tr>\n"
                            + "                                            </table>\n"
                            + "                                        </td>\n"
                            + "                                    </tr>\n"
                            + "                                </table>\n"
                            + "                            </td>\n"
                            + "                        </tr> <!-- COPY -->\n"
                            + "\n"
                            + "                        <tr>\n"
                            + "                            <td bgcolor=\"#ffffff\" align=\"left\"\n"
                            + "                                style=\"padding: 0px 30px 20px 30px; color: #666666; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 18px; font-weight: 400; line-height: 25px;\">\n"
                            + "                                <p style=\"margin: 0;\">If you have any questions, just reply to this email—we're always happy\n"
                            + "                                    to help out.</p>\n"
                            + "                            </td>\n"
                            + "                        </tr>\n"
                            + "                        <tr>\n"
                            + "                            <td bgcolor=\"#ffffff\" align=\"left\"\n"
                            + "                                style=\"padding: 0px 30px 40px 30px; border-radius: 0px 0px 4px 4px; color: #666666; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 18px; font-weight: 400; line-height: 25px;\">\n"
                            + "                                <p style=\"margin: 0;\">Cheers,<br>ShoeShop</p>\n"
                            + "                            </td>\n"
                            + "                        </tr>\n"
                            + "                    </table>\n"
                            + "                </td>\n"
                            + "            </tr>\n"
                            + "            <tr>\n"
                            + "                <td bgcolor=\"#f4f4f4\" align=\"center\" style=\"padding: 30px 10px 0px 10px;\">\n"
                            + "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 600px;\">\n"
                            + "                        <tr>\n"
                            + "                            <td bgcolor=\"#FFECD1\" align=\"center\"\n"
                            + "                                style=\"padding: 30px 30px 30px 30px; border-radius: 4px 4px 4px 4px; color: #666666; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 18px; font-weight: 400; line-height: 25px;\">\n"
                            + "                                <h2 style=\"font-size: 20px; font-weight: 400; color: #111111; margin: 0;\">Need more help?\n"
                            + "                                </h2>\n"
                            + "                                <p style=\"margin: 0;\"><a href=\"https://www.facebook.com/thanhmax1414/\" target=\"_blank\"\n"
                            + "                                        style=\"color: #FFA73B;\">Chat With admin to Support</a></p>\n"
                            + "                            </td>\n"
                            + "                        </tr>\n"
                            + "                    </table>\n"
                            + "                </td>\n"
                            + "            </tr>\n"
                            + "            <tr>\n"
                            + "                <td bgcolor=\"#f4f4f4\" align=\"center\" style=\"padding: 0px 10px 0px 10px;\">\n"
                            + "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 600px;\">\n"
                            + "                        <tr>\n"
                            + "                            <td bgcolor=\"#f4f4f4\" align=\"left\"\n"
                            + "                                style=\"padding: 0px 30px 30px 30px; color: #666666; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 400; line-height: 18px;\">\n"
                            + "                                <br>\n"
                            + "\n"
                            + "                            </td>\n"
                            + "                        </tr>\n"
                            + "                    </table>\n"
                            + "                </td>\n"
                            + "            </tr>\n"
                            + "        </table>\n"
                            + "        <script type='text/javascript'></script>\n"
                            + "    </body>\n"
                            + "\n"
                            + "    </html>";

            
            message.setContent(htmlContent, "text/html; charset=utf-8");
            // From email
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            // Send
            Transport.send(message);
            System.out.println("Send sussced");

        } catch (MessagingException ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
