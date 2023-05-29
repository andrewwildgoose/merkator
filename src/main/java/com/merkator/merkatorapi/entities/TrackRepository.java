package com.merkator.merkatorapi.entities;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackRepository extends MongoRepository<Track, Long> {
}