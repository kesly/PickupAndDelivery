package fr.insa.lyon.ifa1.models.request;

import fr.insa.lyon.ifa1.models.map.Intersection;

public class DurationPassagePoint extends PassagePoint {

    private int duration;

    public DurationPassagePoint(Intersection intersection, int duration) {
        super(intersection);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

}
