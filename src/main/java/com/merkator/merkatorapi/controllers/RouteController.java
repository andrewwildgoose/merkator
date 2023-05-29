package com.merkator.merkatorapi.controllers;

import com.merkator.merkatorapi.entities.Route;
import com.merkator.merkatorapi.entities.RouteRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/routes")
public class RouteController {

    private final RouteRepository routeRepository;

    public RouteController(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @PostMapping
    public Route newRoute(@RequestBody Route route) {
        return this.routeRepository.save(route);
    }
}
