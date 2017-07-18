package com.chanaka.book.repository;

import com.chanaka.book.model.Track;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by chanaka on 7/17/17.
 */
public interface TrackRepository extends ElasticsearchRepository<Track, String> {


}
