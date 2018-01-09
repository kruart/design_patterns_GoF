package design_patterns.creational_patterns.factory_method;

import design_patterns.creational_patterns.factory_method.website.Blog;
import design_patterns.creational_patterns.factory_method.website.Shop;
import design_patterns.creational_patterns.factory_method.website.Website;
import design_patterns.creational_patterns.factory_method.website.WebsiteType;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: return null;
        }
    }
}
