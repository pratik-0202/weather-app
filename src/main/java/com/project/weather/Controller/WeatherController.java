package com.project.weather.Controller;

import com.project.weather.Entity.City;
import com.project.weather.Service.WeatherService;
import com.project.weather.api.Response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public ResponseEntity<?> getWeather(@RequestBody City city){
        WeatherResponse weatherResponse = weatherService.getWeather(city.getCity());
        String greeting = "";
        if(weatherResponse != null){
            greeting = "Weahter feels like " + weatherResponse.getCurrent().getFeelslike();
        }
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
