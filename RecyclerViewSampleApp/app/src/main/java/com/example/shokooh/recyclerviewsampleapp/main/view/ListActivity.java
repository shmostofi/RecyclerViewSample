package com.example.shokooh.recyclerviewsampleapp.main.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shokooh.recyclerviewsampleapp.R;
import com.example.shokooh.recyclerviewsampleapp.main.data.FakeDataSource;
import com.example.shokooh.recyclerviewsampleapp.main.data.ListItem;
import com.example.shokooh.recyclerviewsampleapp.main.logic.Controller;

import java.util.List;

public class ListActivity extends AppCompatActivity implements viewInterface{

    /*
    instance of controller - ctrl
    instance of recyclerView
    instance of items
    array of listItem objects [data]

    action :
    1- @ start : "generate request" for ctrl to fetch data [from db etc.]  for list-items, then 'display'
    2- @ user "click" : "generate data" request from ctrl & 'inflate' [done by ctrl] the DetailsActivity

    viewInterface: function prototypes - helps with modularity

     */

    private Controller ctrl ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ctrl = new Controller(this, new FakeDataSource());
    }

    @Override
    public void setData(List<ListItem> data) {
        /*
        fill in the recyclerView Items with received data from ctrl
         */
    }
}
