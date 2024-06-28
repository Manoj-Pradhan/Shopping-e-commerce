package com.example.jazzy_kart.controller;

import com.example.jazzy_kart.model.Tracking;
import com.example.jazzy_kart.service.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TrackingController {

    @Autowired
    private TrackingService trackingService;

    @PostMapping("/tracking")
    public Tracking saveTracking(@RequestBody Tracking tracking) {
        return trackingService.saveTracking(tracking);
    }
    @GetMapping("/tracking")
    public List<Tracking> getAllTracking() {
        return trackingService.getAllTracking();
    }

    @GetMapping("/tracking/{id}")
    public Tracking getTrackingById(@PathVariable Long id) {
        return trackingService.getTrackingById(id);
    }

    @PutMapping("/tracking/{id}")
    public Tracking updateTracking(@PathVariable Long id, @RequestBody Tracking trackingDetails) {
        return trackingService.updateTracking(id, trackingDetails);
    }


    @DeleteMapping("/tracking/{id}")
    public void deleteTracking(@PathVariable Long id) {
        trackingService.deleteTracking(id);
    }

}
