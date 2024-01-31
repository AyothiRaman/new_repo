package com.database.Controller.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.database.Controller.Model.MongoModel;

public interface MongoRepo extends MongoRepository<MongoModel, Integer>{

}
