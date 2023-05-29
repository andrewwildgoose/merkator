package com.merkator.merkatorapi.entities;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    private final RouteRepository routeRepository;

    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public void saveRoute(Route route) {
        routeRepository.save(route);
    }

    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    // Other methods for querying or manipulating data
}

