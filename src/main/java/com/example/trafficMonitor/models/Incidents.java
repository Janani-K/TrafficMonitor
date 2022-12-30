package com.example.trafficMonitor.models;

import java.util.Date;
import java.util.List;

public class Incidents {

    public long id;
    public String road;
    public int segmentId;
    public String category;
    public int codeDirection;
    public String type;
    public int afrc;
    public String label;
    public String incidentType;
    public String from;
    public String to;
//    public List<Event> events;
    public int distance;
    public int delay;
    public Date start;
    public Date stop;   
    public String reason;
}
