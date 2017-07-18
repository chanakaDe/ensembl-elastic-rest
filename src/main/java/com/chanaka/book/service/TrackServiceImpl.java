package com.chanaka.book.service;

import com.chanaka.book.model.Track;
import com.chanaka.book.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chanaka on 7/17/17.
 */

@Service
public class TrackServiceImpl implements TrackService {

    private TrackRepository trackRepository;

    @Autowired
    public void setTrackRepository(TrackRepository trackRepository) {this.trackRepository = trackRepository;}

    @Override
    public Track save(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public Track findOne(int id) {
        return trackRepository.findOne(id + "");
    }

    @Override
    public Iterable<Track> findAll() {
        return trackRepository.findAll();
    }
}
