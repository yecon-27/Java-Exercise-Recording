package com.ava.adt;

import java.util.Comparator;

public class GeoObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {
    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        if (o1.getArea() < o2.getArea()) {
            return -1;
        } else if (o1.getArea() > o2.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}
	


