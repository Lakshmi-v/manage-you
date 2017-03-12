package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
	//@Inject MailerPlugin mailerClient;
    public Result index() {
       
        
/*
          String cid = "1234";
          Email email = new Email();
          email.setSubject("Simple email");
          email.setFrom("Mister FROM <lakshmi@thrymr.net>");
          email.addTo("Miss TO <lakshmi@thrymr.net>");
            // adds attachment
        //  email.addAttachment("attachment.pdf", new File("/some/path/attachment.pdf"));
            // adds inline attachment from byte array
         // email.addAttachment("data.txt", "data".getBytes(), "text/plain", "Simple data", EmailAttachment.INLINE);
            // adds cid attachment
        //  email.addAttachment("image.jpg", new File("/some/path/image.jpg"), cid);
            // sends text, HTML or both...
          email.setBodyText("A text message");
          email.setBodyHtml("<html><body><p>An <b>html</b> message with cid <img src=\"cid:" + cid + "\"></p></body></html>");
          mailerClient.send(email);*/
          return ok(index.render("Your new application is ready."));
    }

}
