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

}
