package fr.insa.lyon.ifa1.models.request;

import fr.insa.lyon.ifa1.models.map.Intersection;

public class PassagePoint {
    private Intersection address;

    public PassagePoint(Intersection address) {
        this.address = address;
    }

    public Intersection getAddress() {
        return address;
    }
}
