package com.stackroute.repository;

import com.stackroute.domain.Track;

import com.stackroute.exception.TrackNotFoundException;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;


//@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {

}
