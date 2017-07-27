package com.chanaka.track.repository;


import com.chanaka.track.model.TrackJPA;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chanaka on 7/27/17.
 */
public interface TrackJPARepository extends JpaRepository<TrackJPA, Integer> {

}
