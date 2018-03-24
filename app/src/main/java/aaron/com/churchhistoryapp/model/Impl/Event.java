package aaron.com.churchhistoryapp.model.Impl;

import java.util.Date;

import aaron.com.churchhistoryapp.model.Interface.IEvent;

/**
 * Created by Aaron on 2/14/2018.
 */

public class Event implements IEvent {

    private String name;
    private String description;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
