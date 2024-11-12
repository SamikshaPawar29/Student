package com.example.SpringMongoProject.Repo;

import com.example.SpringMongoProject.Entity.College;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CollegeRepo extends MongoRepository<College, String> {
}
