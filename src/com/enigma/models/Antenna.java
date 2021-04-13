package com.enigma.models;

import java.util.*;

public class Antenna {
    public Set<String> radius = new HashSet<>();
    private Integer coordinateX;
    private Integer coordinateY;

    public Antenna(Integer coordinateX, Integer coordinateY) {
//        this.coordinateX = coordinateX;
//        this.coordinateY = coordinateY;

        for(Integer i = -1; i <= 1; i++){
            for(Integer j = -1; j <= 1; j++){
                this.radius.add(createArea(coordinateX+i, coordinateY+j));
            }
        }

    }

    public Integer getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(Integer coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Integer getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(Integer coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "Antenna{" +
                "radius=" + radius +
                '}';
    }

    public String createArea(Integer x, Integer y){
        return "("+x+","+y+")";
    }
}