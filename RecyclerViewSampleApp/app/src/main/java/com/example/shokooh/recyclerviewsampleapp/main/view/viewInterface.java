package com.example.shokooh.recyclerviewsampleapp.main.view;

import android.view.View;

import com.example.shokooh.recyclerviewsampleapp.main.data.ListItem;

import java.util.List;

/**
 * Created by smostofi on 18/09/2017.
 */

public interface viewInterface {

    void setDataList(List<ListItem> data);
    void startDetailActivity(String contect, String Date, int colorResource, View v);
}
