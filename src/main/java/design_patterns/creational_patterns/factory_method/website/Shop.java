package design_patterns.creational_patterns.factory_method.website;

import design_patterns.creational_patterns.factory_method.pages.CartPage;
import design_patterns.creational_patterns.factory_method.pages.ItemPage;
import design_patterns.creational_patterns.factory_method.pages.SearchPage;

public class Shop extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
