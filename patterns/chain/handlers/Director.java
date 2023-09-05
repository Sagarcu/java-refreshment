package patterns.chain.handlers;

import patterns.chain.CustomRequest;
import patterns.chain.Handler;
import patterns.chain.RequestType;

public class Director extends Handler {

    @Override
    public void handleRequest(CustomRequest request) {
        if (request.getRequestType() == RequestType.EVENEMENT)
        {
            System.out.println("Evenement mag ik goedkeuren als Director!");
        } else if (request.getRequestType() == RequestType.LEASE_DECLARATIE) {
            System.out.println("Dure Lease declaratie mag ik goedkeuren als Director!");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
