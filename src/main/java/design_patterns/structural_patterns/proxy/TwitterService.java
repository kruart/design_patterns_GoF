package design_patterns.structural_patterns.proxy;

public interface TwitterService {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}
