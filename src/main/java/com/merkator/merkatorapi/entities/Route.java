package com.merkator.merkatorapi.entities;

import com.mongodb.client.model.geojson.Point;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "tracks")
public class Route {
    @Id
    private final Long id;
    private final String name;
    private final Track track;

    public Route(Long id, String name, Track track) {
        this.id = id;
        this.name = name;
        this.track = track;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Track getTrack() {
        return track;
    }

}