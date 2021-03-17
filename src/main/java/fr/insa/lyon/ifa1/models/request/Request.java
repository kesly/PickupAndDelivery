package fr.insa.lyon.ifa1.models.request;

public class Request {
    private DurationPassagePoint pickup, delivery;

    public Request(DurationPassagePoint pickup, DurationPassagePoint delivery) {
        this.pickup = pickup;
        this.delivery = delivery;
    }

    public DurationPassagePoint getPickup() {
        return pickup;
    }

    public DurationPassagePoint getDelivery() {
        return delivery;
    }
}
