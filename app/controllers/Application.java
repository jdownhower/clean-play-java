package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

    /**
     * Renders the index template for the home page.
     * @return Returns the rendered index template with the intro message.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
