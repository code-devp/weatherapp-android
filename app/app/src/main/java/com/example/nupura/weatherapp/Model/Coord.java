package com.example.nupura.weatherapp.Model;

/**
 * Created by Nupura on 10/30/2017.
 */

public class Coord {

private double lat;
private double lon;



    public Coord(double lat, double lon){
    this.lat = lat;
    this.lon = lon;

}


    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

}
