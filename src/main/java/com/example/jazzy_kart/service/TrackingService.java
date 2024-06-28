package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.ITrackingService;
import com.example.jazzy_kart.model.Tracking;
import com.example.jazzy_kart.repository.TrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackingService implements ITrackingService {

    @Autowired
    private TrackingRepository trackingRepository;

    @Override
    public Tracking saveTracking(Tracking tracking) {
        return trackingRepository.save(tracking);
    }

    @Override
    public List<Tracking> getAllTracking() {
        return trackingRepository.findAll();
    }

    @Override
    public Tracking getTrackingById(Long id) {
        return trackingRepository.findById(id).orElse(null);
    }

    @Override
    public Tracking updateTracking(Long id , Tracking trackingDetails) {
        return trackingRepository.findById(id)
                .map(tracking -> {
                    tracking.setProductId(trackingDetails.getProductId());
                    tracking.setStatus(trackingDetails.getStatus());
                    return trackingRepository.save(tracking);
                })
                .orElse(null);
    }
    @Override
    public void deleteTracking(Long id) {
        trackingRepository.deleteById(id);
    }
}

