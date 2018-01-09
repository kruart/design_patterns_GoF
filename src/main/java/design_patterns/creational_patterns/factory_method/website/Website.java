package design_patterns.creational_patterns.factory_method.website;

import design_patterns.creational_patterns.factory_method.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();


    public List<Page> getPages() {
        return pages;
    }
}
