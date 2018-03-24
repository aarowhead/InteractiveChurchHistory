package aaron.com.churchhistoryapp.model.Interface;

import java.util.Date;

/**
 * Created by Aaron on 2/14/2018.
 */

public interface IEvent {

    public String getName();
    public void setName(String name);

    public String getDescription();
    public void setDescription(String description);

    public Date getDate();
    public void setDate(Date date);
}
