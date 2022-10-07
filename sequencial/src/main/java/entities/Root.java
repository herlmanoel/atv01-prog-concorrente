package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty("date")
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String date;

    @JsonProperty("classroom")
    public int getClassroom() {
        return this.classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    int classroom;

    @JsonProperty("event")
    public String getEvent() {
        return this.event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    String event;

    @JsonProperty("status")
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status;

    @JsonProperty("shift")
    public String getShift() {
        return this.shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    String shift;

    @JsonProperty("shift_name")
    public String getShift_name() {
        return this.shift_name;
    }

    public void setShift_name(String shift_name) {
        this.shift_name = shift_name;
    }

    String shift_name;

    @Override
    public String toString() {
        return "Root{" +
                "date='" + date + '\'' +
                ", classroom=" + classroom +
                ", event='" + event + '\'' +
                ", status='" + status + '\'' +
                ", shift='" + shift + '\'' +
                ", shift_name='" + shift_name + '\'' +
                '}';
    }
}