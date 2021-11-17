package com.demo.ISSDemo.service;

import com.demo.ISSDemo.models.ISSLocator;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationService {

    private final String FAILED = "failed";

    @HystrixCommand(fallbackMethod = "fallback")
    public ISSLocator getLocation() {

        RestTemplate rt = new RestTemplate();
        return rt.getForObject("http://api.open-notify.org/iss-now.json", ISSLocator.class);

    }

    public ISSLocator fallback() {

        ISSLocator issl = new ISSLocator();
        issl.setMessage(FAILED);
        return issl;

    }

}