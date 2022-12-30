package com.example.trafficMonitor.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "traffic_data")
public class TrafficData {
//    @Id
//    public Date _uploaded_at;
//    @Column (name = "success")
//    public String success;
//    public String copyright;
    public Date dateTime;
    public List<Roads> roads;
    public Totals totals;
//    public List<Warnings> warnings;
}
