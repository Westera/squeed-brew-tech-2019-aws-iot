package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sensor {
    String sensor;
    String state;
    String message;
    String sequence;


    public Sensor() {};

    public Sensor(String sensor, String state, String message, String sequence) {
        this.sensor = sensor;
        this.state = state;
        this.message = message;
        this.sequence = sequence;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "{" +
            "\"sensor\": " + "\"" + sensor + "\"" + "," +
            "\"state\": " + "\"" + state + "\"" + "," +
            "\"sequence\": " + "\"" + sequence + "\"" + "," +
            "\"message\": " + "\"" + message + "\"" +
            "}";
    }
}
