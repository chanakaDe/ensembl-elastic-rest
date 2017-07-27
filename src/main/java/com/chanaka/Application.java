package com.chanaka;

import com.chanaka.track.model.GenomeJPA;
import com.chanaka.track.model.LocationJPA;
import com.chanaka.track.model.ReleaseJPA;
import com.chanaka.track.model.TrackJPA;
import com.chanaka.track.service.TrackJPAService;
import com.chanaka.track.service.TrackService;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ElasticsearchOperations es;

    @Autowired
    private TrackJPAService trackJPAService;

    @Autowired
    private TrackService trackService;

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        printElasticSearchInfo();

        List<TrackJPA> tracks = trackJPAService.findAlLTracks();
        List<GenomeJPA> genomes = trackJPAService.findGenomesOnTracks();
        List<LocationJPA> locations = trackJPAService.findLocationsOnTracks();
        List<ReleaseJPA> releases = trackJPAService.findReleaseOnTracks();
        tracks.forEach(x ->
                trackService.save(tracks, genomes, locations, releases);
        );

    }

    //useful for debug
    private void printElasticSearchInfo() {

        System.out.println("--ElasticSearch-->");
        Client client = es.getClient();
        Map<String, String> asMap = client.settings().getAsMap();

        asMap.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
        System.out.println("<--ElasticSearch--");
    }

}