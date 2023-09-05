package patterns.chain.handlers;

import patterns.chain.CustomRequest;
import patterns.chain.Handler;

public class CEO extends Handler {
    @Override
    public void handleRequest(CustomRequest request) {
        System.out.println("Als CEO hou ik ervan om " + request.getRequestType().toString() + " goed te keuren!");
    }
}
