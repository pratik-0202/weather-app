package com.project.weather.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "config_weather")
@Data
@NoArgsConstructor
public class WeatherEntity {
    String key;
    String value;
}
