/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

/**
 *
 * @author HP
 */
public class Schedule {
    private String date;
    private String time;
    private String event;
    private String location;

    public Schedule(String date, String time, String event,String location) {
        this.date = date;
        this.time = time;
        this.event = event;
        this.location=location;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getEvent() {
        return event;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}

