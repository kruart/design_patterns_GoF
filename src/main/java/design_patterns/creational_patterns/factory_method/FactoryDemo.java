package design_patterns.creational_patterns.factory_method;

import design_patterns.creational_patterns.factory_method.website.Website;
import design_patterns.creational_patterns.factory_method.website.WebsiteType;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
