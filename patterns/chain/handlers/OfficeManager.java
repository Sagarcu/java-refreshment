package patterns.chain.handlers;

import patterns.chain.CustomRequest;
import patterns.chain.Handler;
import patterns.chain.RequestType;

public class OfficeManager extends Handler {
    @Override
    public void handleRequest(CustomRequest request) {
        if (request.getRequestType() == RequestType.LOON)
        {
          System.out.println("Loon mag ik uitbetalen als Office Manager");
        } else if (request.getRequestType() == RequestType.ARBO_DECLARATIE) {
            System.out.println("Arbo declaratie mag ik goedkeuren als Office Manager");
        } else if (request.getRequestType() == RequestType.LEASE_DECLARATIE && request.getAmount() < 1000) {
            System.out.println("Lease onder 1000,- mag ik goedkeuren als OfficeManager");
        }else
        {
            successor.handleRequest(request);
        }
    }
}
