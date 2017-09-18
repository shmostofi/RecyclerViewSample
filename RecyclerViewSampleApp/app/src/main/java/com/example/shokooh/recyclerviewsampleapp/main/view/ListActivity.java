package com.example.shokooh.recyclerviewsampleapp.main.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shokooh.recyclerviewsampleapp.R;

/*
what methods & variables this class should have
what are its behaviours
 */
public class ListActivity extends AppCompatActivity {

    /*
    instance of controller - ctrl
    instance of recyclerView

    action :
    1- request ctrl to fetch data [from db etc.]  for list-items, then display
    2- get click events from user, and generate request for data again & inflate the DetailsActivity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
}
