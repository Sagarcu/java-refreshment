package patterns.chain;

public class CustomRequest {
    private final RequestType requestType;
    private final double amount;

    public CustomRequest(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
