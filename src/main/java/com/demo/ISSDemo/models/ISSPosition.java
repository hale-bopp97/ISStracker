package com.demo.ISSDemo.models;

public class ISSPosition {

    //{
    //  "timestamp": 1632477888,
    //  "message": "success",
    //  "iss_position": {
    //    "latitude": "17.0896",
    //    "longitude": "-136.6867"
    //  }
    //}

    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ISSPosition{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

}
