package design_patterns.creational_patterns.factory_method;

import design_patterns.creational_patterns.factory_method.website.Website;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite("blog");
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite("shop");
        System.out.println(site.getPages());
    }
}
