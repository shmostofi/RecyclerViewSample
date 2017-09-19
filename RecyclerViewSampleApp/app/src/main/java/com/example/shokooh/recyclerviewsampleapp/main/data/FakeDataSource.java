package com.example.shokooh.recyclerviewsampleapp.main.data;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by smostofi on 18/09/2017.
 */

public class FakeDataSource implements dataInterface {

    private static final int sizeOfCollection = 12 ;
    private Random random;

    String[] contents = {
            "here is message one",
            "here is message two",
            "here is message three",
            "here is message four",
    };

    String[] dates = {
            "6:30AM 06/01/2017",
            "9:26PM 04/22/2013",
            "2:01PM 12/02/2015",
            "2:43AM 09/7/2018"
    };

//    int[] colors = {
//            #F06292,
//
//
//    };

    @Override
    public List<ListItem> getData() {

        ArrayList<ListItem> outputList = new ArrayList<>();
        for(int i=0 ; i<sizeOfCollection ; i++)
        {
            ListItem li = new ListItem(dates[random.nextInt(4)], contents[random.nextInt(4)]);
            outputList.add(li);

        }
        return outputList;
    }
}
