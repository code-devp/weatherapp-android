package com.example.nupura.weatherapp.Model;

/**
 * Created by Nupura on 10/30/2017.
 */

public class Weather {

    private int id;
    private String description;
    private String main;
    private String icon;

    public Weather(int id, String description, String main, String icon) {
        this.id = id;
        this.description = description;
        this.main = main;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}


