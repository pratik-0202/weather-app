package com.project.weather.cache;

import com.project.weather.Entity.WeatherEntity;
import com.project.weather.Repository.WeatherRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {

    public enum keys{
        WEATHER_API;
    }

    @Autowired
    private WeatherRepo weatherRepo;

    public Map<String, String> appCache = new HashMap<>();


    @PostConstruct
    public void init(){
        List<WeatherEntity> all = weatherRepo.findAll();
        for(WeatherEntity weatherEntity : all){
            appCache.put(weatherEntity.getKey(), weatherEntity.getValue());
        }
    }
}
