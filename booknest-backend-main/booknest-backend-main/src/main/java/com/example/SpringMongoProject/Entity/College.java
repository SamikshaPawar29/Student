package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "colleges")
public class College {

    @Id
    private String _id;
    private String collegename;
    private String collegeaddress;
    private String contactnumber;

    public College(String _id, String collegename, String collegeaddress, String contactnumber) {
        this._id = _id;
        this.collegename = collegename;
        this.collegeaddress = collegeaddress;
        this.contactnumber = contactnumber;
    }

    public College() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getCollegeaddress() {
        return collegeaddress;
    }

    public void setCollegeaddress(String collegeaddress) {
        this.collegeaddress = collegeaddress;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    @Override
    public String toString() {
        return "College{" +
                "_id='" + _id + '\'' +
                ", collegename='" + collegename + '\'' +
                ", collegeaddress='" + collegeaddress + '\'' +
                ", contactnumber='" + contactnumber + '\'' +
                '}';
    }
}
