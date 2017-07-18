package com.chanaka.book.controller;

import com.chanaka.book.model.Track;
import com.chanaka.book.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chanaka on 7/17/17.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/elastic-test/master/track")
public class TrackController {

    @Autowired
    private TrackService trackService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Track> findAll() {
        return trackService.findAll();
    }

    @RequestMapping(value = "/find-by/{id}", method = RequestMethod.GET)
    public Track findOne(@PathVariable int id) {
        return trackService.findOne(id);
    }
}
