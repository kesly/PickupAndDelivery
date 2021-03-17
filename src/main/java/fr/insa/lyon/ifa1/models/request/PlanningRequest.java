package fr.insa.lyon.ifa1.models.request;

public class PlanningRequest {
    private Request[] requests;
    private Depot depot;

    public PlanningRequest(Request[] requests, Depot depot) {
        this.requests = requests;
        this.depot = depot;
    }

    public Request[] getRequests() {
        return requests;
    }

    public Depot getDepot() {
        return depot;
    }

    public PassagePoint[] getPassagePoints() {
        int nbPassagePoints = getRequests().length * 2 + 1;
        PassagePoint[] pps = new PassagePoint[nbPassagePoints];
        pps[0] = getDepot();
        for (int i = 0; i < getRequests().length; i++) {
            pps[i * 2 + 1] = getRequests()[i].getPickup();
            pps[i * 2 + 2] = getRequests()[i].getDelivery();
        }
        return pps;
    }
}
