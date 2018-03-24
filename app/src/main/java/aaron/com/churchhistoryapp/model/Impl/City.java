package aaron.com.churchhistoryapp.model.Impl;

import android.media.Image;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import aaron.com.churchhistoryapp.model.Interface.IEvent;
import aaron.com.churchhistoryapp.model.Interface.ILocation;
import aaron.com.churchhistoryapp.model.Interface.IPerson;
import aaron.com.churchhistoryapp.model.Interface.IRevelation;
import aaron.com.churchhistoryapp.model.Interface.ISite;
import aaron.com.churchhistoryapp.model.Interface.ITimePeriod;

/**
 * Created by Aaron on 2/14/2018.
 */

public class City extends Location {

    private List<ISite> sites;
    private List<IRevelation> revelations;//Stores revelations without a specific site
    private List<IEvent> events;//Stores events without a specific site
    private List<IPerson> people;//Stores people without a specific site
    private List<Image> images;//Stores images without a specific site

    public void setSites(List<ISite> sites) {
        this.sites = sites;
    }

    public List<ISite> getSites() {
        return sites;
    }

    public void setEvents(List<IEvent> events) {
        this.events = events;
    }

    @Override
    public List<IEvent> getEvents() {
        //Go through each site and get events
        ArrayList<IEvent> returnEvents = new ArrayList<>();
        returnEvents.addAll(events);
        for(ISite site : sites) {
            returnEvents.addAll(site.getEvents());
        }
        return returnEvents;
    }

    public void setRevelations(List<IRevelation> revelations) {
        this.revelations = revelations;
    }

    @Override
    public List<IRevelation> getRevelations() {
        //Go through each site and get revelations
        ArrayList<IRevelation> returnRevelations = new ArrayList<>();
        returnRevelations.addAll(revelations);
        for(ISite site : sites) {
            returnRevelations.addAll(site.getRevelations());
        }
        return returnRevelations;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public List<Image> getImages() {
        //Go through each site and get images
        ArrayList<Image> returnImages = new ArrayList<>();
        returnImages.addAll(images);
        for(ISite site : sites) {
            returnImages.addAll(site.getImages());
        }
        return returnImages;
    }

    public void setPeople(List<IPerson> people) {
        this.people = people;
    }

    @Override
    public List<IPerson> getPeople() {
        //Go through each site and get people
        ArrayList<IPerson> returnPeople = new ArrayList<>();
        returnPeople.addAll(people);
        for(ISite site : sites) {
            returnPeople.addAll(site.getPeople());
        }
        return returnPeople;
    }
}
