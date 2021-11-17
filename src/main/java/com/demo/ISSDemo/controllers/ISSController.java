package com.demo.ISSDemo.controllers;

import com.demo.ISSDemo.models.ISSLocator;
import com.demo.ISSDemo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ISSController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/issLocation")
    @CrossOrigin
    public ISSLocator getISSLocation() {

        return this.locationService.getLocation();

    }

}
