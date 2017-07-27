package com.chanaka.track.service;

import com.chanaka.track.model.GenomeJPA;
import com.chanaka.track.model.LocationJPA;
import com.chanaka.track.model.ReleaseJPA;
import com.chanaka.track.model.TrackJPA;
import com.chanaka.track.repository.TrackJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chanaka on 7/27/17.
 */

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TrackJPAService {

    @Autowired
    private TrackJPARepository trackJPARepository;

    public List<TrackJPA> findAlLTracks() {
        return trackJPARepository.findAll();
    }

    public List<GenomeJPA> findGenomesOnTracks() {
        return trackJPARepository.findAll();
    }

    public List<LocationJPA> findLocationsOnTracks() {
        return trackJPARepository.findAll();
    }

    public List<ReleaseJPA> findReleaseOnTracks() {
        return trackJPARepository.findAll();
    }

}
