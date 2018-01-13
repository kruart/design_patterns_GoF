package design_patterns.behavioral_patterns.chainOfResponsibility.chOfResp_example;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE && request.getAmount() < 1500) {
            System.out.println("VPs can approve purchases below 1500");
        } else {
            successor.handleRequest(request);
        }
    }
}
