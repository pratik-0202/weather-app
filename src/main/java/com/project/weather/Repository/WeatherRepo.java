package com.project.weather.Repository;

import com.project.weather.Entity.WeatherEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepo extends MongoRepository<WeatherEntity, ObjectId> {
}
