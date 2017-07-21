package com.chanaka.book.controller;

import com.chanaka.book.model.Track;
import com.chanaka.book.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/find-by/{description}/{track_type}", method = RequestMethod.GET)
    public List<Track> findOne(@PathVariable String description, @PathVariable String track_type) {
        return trackService.findByDescription(description, track_type);
    }

    @RequestMapping(value = "/search/{text}", method = RequestMethod.GET)
    public List<Track> searchTracks(@PathVariable String text) {
        return trackService.searchTracks(text);
    }

    @RequestMapping(value = "/search_advanced", method = RequestMethod.GET)
    public List<Track> searchTracksByParams(@RequestParam(value = "text", required = true) String text,
                                            @RequestParam(value = "species", required = true) String species,
                                            @RequestParam(value = "type", required = true) String type,
                                            @RequestParam(value = "release", required = true) int release,
                                            @RequestParam(value = "division", required = true) String division) {
        return trackService.searchTracksByParams(text, species, type, release, division);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String paramsTest(@RequestParam(value = "param1", required = true) String param1, @RequestParam(value = "param2", required = false) String param2) {
        return param1 + " - " + param2;
    }

}
