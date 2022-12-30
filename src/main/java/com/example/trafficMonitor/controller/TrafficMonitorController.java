package com.example.trafficMonitor.controller;

import com.example.trafficMonitor.models.TrafficData;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TrafficMonitorController {

    @GetMapping("/getTrafficData")
    public TrafficData getTrafficData(){
        String uri = "https://api.anwb.nl/v2/incidents?apikey=QYUEE3fEcFD7SGMJ6E7QBCMzdQGqRkAi&polylines=true&polylineBounds=true&totals=true";
        RestTemplate restTemplate = new RestTemplate();
        TrafficData data = restTemplate.getForObject(uri, TrafficData.class);
        return data;
    }
}
