package aaron.com.churchhistoryapp.model.Impl;

import com.google.android.gms.maps.model.LatLng;

import aaron.com.churchhistoryapp.model.Interface.ILocation;
import aaron.com.churchhistoryapp.model.Interface.ITimePeriod;

/**
 * Created by Aaron on 2/14/2018.
 */

public abstract class Location implements ILocation {

    private LatLng location;
    private ITimePeriod timePeriod;

    public void setLatLng(LatLng latlng) {
        this.location = latlng;
    }

    @Override
    public LatLng getLatLng() {
        return location;
    }

    public void setTimePeriod(ITimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    @Override
    public ITimePeriod getTimePeriod() {
        return timePeriod;
    }
}
