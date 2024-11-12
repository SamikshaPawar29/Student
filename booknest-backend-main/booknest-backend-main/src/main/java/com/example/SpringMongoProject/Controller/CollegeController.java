package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.College;
import com.example.SpringMongoProject.Service.CollegeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/college")
public class CollegeController {

    @Autowired
    private CollegeServices collegeServices;

    @PostMapping(value = "/save")
    private String saveCollege(@RequestBody College college) {
        collegeServices.saveOrUpdate(college);
        return college.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<College> getColleges() {
        return collegeServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private College update(@RequestBody College college, @PathVariable(name = "id") String _id) {
        college.set_id(_id);
        collegeServices.saveOrUpdate(college);
        return college;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteCollege(@PathVariable("id") String _id) {
        collegeServices.deleteCollege(_id);
    }

    @RequestMapping("/search/{id}")
    private College getCollege(@PathVariable(name = "id") String collegeId) {
        return collegeServices.getCollegeByID(collegeId);
    }
}
