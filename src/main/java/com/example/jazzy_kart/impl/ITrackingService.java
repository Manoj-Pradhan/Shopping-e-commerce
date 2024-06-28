package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.Tracking;

import java.util.List;

public interface ITrackingService {

    Tracking saveTracking(Tracking tracking);

    List<Tracking> getAllTracking();

    Tracking getTrackingById(Long id);

    Tracking updateTracking(Long id, Tracking trackingDetails);

    void deleteTracking(Long id);
}
