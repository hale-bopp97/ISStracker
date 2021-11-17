package com.demo.ISSDemo.models;

public class ISSLocator {

    //{
    //  "timestamp": 1632477888,
    //  "message": "success",
    //  "iss_position": {
    //    "latitude": "17.0896",
    //    "longitude": "-136.6867"
    //  }
    //}

    private long timestamp;
    private String message;
    private ISSPosition iss_position;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ISSPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(ISSPosition iss_position) {
        this.iss_position = iss_position;
    }

    @Override
    public String toString() {
        return "ISSLocator{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", iss_position=" + iss_position +
                '}';

    }

}
