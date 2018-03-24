package aaron.com.churchhistoryapp.model.Impl;

import android.media.Image;

import java.util.List;

import aaron.com.churchhistoryapp.model.Interface.IEvent;
import aaron.com.churchhistoryapp.model.Interface.IPerson;
import aaron.com.churchhistoryapp.model.Interface.IRevelation;
import aaron.com.churchhistoryapp.model.Interface.ISite;

/**
 * Created by Aaron on 2/14/2018.
 */

public class Site extends Location implements ISite {

    private List<IPerson> people;
    private List<IRevelation> revelations;
    private List<Image> images;
    private List<IEvent> events;

    @Override
    public List<IPerson> getPeople() {
        return people;
    }

    public void setPeople(List<IPerson> people) {
        this.people = people;
    }

    @Override
    public List<IRevelation> getRevelations() {
        return revelations;
    }

    public void setRevelations(List<IRevelation> revelations) {
        this.revelations = revelations;
    }

    @Override
    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public List<IEvent> getEvents() {
        return events;
    }

    public void setEvents(List<IEvent> events) {
        this.events = events;
    }

    @Override
    public List<ISite> getSites() {
        return null;
    }
}
