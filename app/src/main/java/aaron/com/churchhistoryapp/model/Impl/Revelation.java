package aaron.com.churchhistoryapp.model.Impl;

import java.net.URL;

import aaron.com.churchhistoryapp.model.Interface.IRevelation;

/**
 * Created by Aaron on 2/14/2018.
 */

public class Revelation implements IRevelation {

    private String name;
    private String description;
    private URL link;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public URL getLink() {
        return link;
    }

    @Override
    public void setLink(URL link) {
        this.link = link;
    }
}
