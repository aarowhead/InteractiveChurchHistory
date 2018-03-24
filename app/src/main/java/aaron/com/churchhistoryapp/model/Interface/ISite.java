package aaron.com.churchhistoryapp.model.Interface;

import android.media.Image;

import java.util.List;

/**
 * Created by Aaron on 2/14/2018.
 */

public interface ISite {

    public List<IPerson> getPeople();
    public void setPeople(List<IPerson> people);

    public List<IRevelation> getRevelations();
    public void setRevelations(List<IRevelation> revelations);

    public List<Image> getImages();
    public void setImages(List<Image> images);

    public List<IEvent> getEvents();
    public void setEvents(List<IEvent> events);

    public List<ISite> getSites();
}
