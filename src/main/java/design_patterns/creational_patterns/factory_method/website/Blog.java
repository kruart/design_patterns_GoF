package design_patterns.creational_patterns.factory_method.website;

import design_patterns.creational_patterns.factory_method.pages.AboutPage;
import design_patterns.creational_patterns.factory_method.pages.CommentPage;
import design_patterns.creational_patterns.factory_method.pages.ContactPage;
import design_patterns.creational_patterns.factory_method.pages.PostPage;

public class Blog extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
