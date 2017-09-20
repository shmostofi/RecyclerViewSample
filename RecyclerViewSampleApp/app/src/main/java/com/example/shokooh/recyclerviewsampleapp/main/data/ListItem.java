package com.example.shokooh.recyclerviewsampleapp.main.data;

/**
 * Created by smostofi on 18/09/2017.
 */

public class ListItem {
    private int color;
    private String date;
    private String content;

    public ListItem(String date, String content) {
//        this.color = color;
        this.date = date;
        this.content = content;
    }

    public int getColor() {
        return color;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }
}
