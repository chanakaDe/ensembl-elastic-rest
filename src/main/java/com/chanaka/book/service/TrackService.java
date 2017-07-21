package com.chanaka.book.service;

import com.chanaka.book.model.Track;

import java.util.List;

/**
 * Created by chanaka on 7/17/17.
 */
public interface TrackService {

    Track save(Track track);

    Track findOne(int id);

    Iterable<Track> findAll();

    List<Track> findByDescription(String description, String track_type);

    List<Track> searchTracks(String text);

    List<Track> searchTracksByParams(String text, String species, String type, int release, String division);

}
