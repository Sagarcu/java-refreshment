package patterns.chain;

import patterns.chain.handlers.CEO;
import patterns.chain.handlers.Director;
import patterns.chain.handlers.OfficeManager;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        OfficeManager ine = new OfficeManager();
        Director rene = new Director();
        CEO pascal = new CEO();

        ine.setSuccessor(rene);
        rene.setSuccessor(pascal);

        CustomRequest request = new CustomRequest(RequestType.LAMBOVOORDEZAAK, 10000);
        ine.handleRequest(request);

        request = new CustomRequest(RequestType.LOON, 3000);
        ine.handleRequest(request);

        request = new CustomRequest(RequestType.LEASE_DECLARATIE, 778);
        ine.handleRequest(request);

        request = new CustomRequest(RequestType.LEASE_DECLARATIE, 1500);
        ine.handleRequest(request);
    }

}
