package aaron.com.churchhistoryapp.model.Interface;

import android.media.Image;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by Aaron on 2/14/2018.
 */

public interface ILocation {

    public LatLng getLatLng();

    public List<IEvent> getEvents();

    public List<IRevelation> getRevelations();

    public ITimePeriod getTimePeriod();

    public List<Image> getImages();

    public List<IPerson> getPeople();

    public List<ISite> getSites();

}
