package com.example.sohail.macha.Model;

public class Model {

    private String title;
    private int id;
    private String url;

    public Model(String title, int id, String url) {
        this.title = title;
        this.id = id;
        this.url = url;
    }

    public Model() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
