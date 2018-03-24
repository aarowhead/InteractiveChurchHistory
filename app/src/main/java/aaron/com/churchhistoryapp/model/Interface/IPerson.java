package aaron.com.churchhistoryapp.model.Interface;

import java.util.Date;

/**
 * Created by Aaron on 2/14/2018.
 */

public interface IPerson {

    public String getName();
    public Date getDateOfBirth();
    public String getLocationOfBirth();//TODO:Maybe change to location object?
    public String getDescription();
    public void setName(String name);
    public void setDateOfBirth(Date date);
    public void setLocationOfBirth(String location);
    public void setDescription(String description);

}
