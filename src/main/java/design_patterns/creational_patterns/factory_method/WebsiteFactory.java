package design_patterns.creational_patterns.factory_method;

import design_patterns.creational_patterns.factory_method.website.Blog;
import design_patterns.creational_patterns.factory_method.website.Shop;
import design_patterns.creational_patterns.factory_method.website.Website;

public class WebsiteFactory {

    public static Website getWebsite(String siteType) {
        switch (siteType) {
            case "blog": {
                return new Blog();
            }
            case "shop": {
                return new Shop();
            }
            default: return null;
        }
    }
}
