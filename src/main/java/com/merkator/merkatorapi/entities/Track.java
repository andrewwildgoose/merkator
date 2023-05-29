package com.merkator.merkatorapi.entities;

import com.mongodb.client.model.geojson.Point;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "tracks")
public class Track {
    @Id
    private final Long id;
    private final String name;
    private final List<Point> points;

    public Track(Long id, String name, List<Point> points) {
        this.id = id;
        this.name = name;
        this.points = points;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Point> getPoints() {
        return points;
    }

}
