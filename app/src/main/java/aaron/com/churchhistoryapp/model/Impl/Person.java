package aaron.com.churchhistoryapp.model.Impl;

import java.util.Date;

import aaron.com.churchhistoryapp.model.Interface.IPerson;

/**
 * Created by Aaron on 2/14/2018.
 */

public class Person implements IPerson {

    private String name;
    private Date dateOfBirth;
    private String locationOfBirth;
    private String description;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDateOfBirth(Date date) {
        this.dateOfBirth = date;
    }

    @Override
    public void setLocationOfBirth(String location) {
        this.locationOfBirth = location;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getLocationOfBirth() {
        return locationOfBirth;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
