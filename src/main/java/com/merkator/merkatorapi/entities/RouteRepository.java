package com.merkator.merkatorapi.entities;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<Route, Long> {
}