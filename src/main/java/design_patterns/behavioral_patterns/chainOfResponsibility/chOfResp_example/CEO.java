package design_patterns.behavioral_patterns.chainOfResponsibility.chOfResp_example;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
