package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.College;
import com.example.SpringMongoProject.Repo.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServices {

    @Autowired
    private CollegeRepo repo;

    public void saveOrUpdate(College college) {
        repo.save(college);
    }

    public Iterable<College> listAll() {
        return this.repo.findAll();
    }

    public void deleteCollege(String id) {
        repo.deleteById(id);
    }

    public College getCollegeByID(String collegeId) {
        return repo.findById(collegeId).orElse(null);
    }
}
