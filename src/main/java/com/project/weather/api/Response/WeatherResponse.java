package com.project.weather.api.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse {

    private Current current;

    @Getter
    @Setter
    public class Current{

        private int temperature;

        @JsonProperty("weahter_descriptions")
        private List<String> weatherDescriptions;

        private int feelslike;
    }

}






