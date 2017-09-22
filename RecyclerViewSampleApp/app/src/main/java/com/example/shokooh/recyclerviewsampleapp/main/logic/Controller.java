package com.example.shokooh.recyclerviewsampleapp.main.logic;

import com.example.shokooh.recyclerviewsampleapp.main.data.dataInterface;
import com.example.shokooh.recyclerviewsampleapp.main.view.viewInterface;

/**
 * Created by smostofi on 18/09/2017.
 */

public class Controller {

    private viewInterface vi;
    private dataInterface di;

    public Controller(viewInterface view, dataInterface data) {
        vi = view ;
        di = data ;
        setData();
    }

    public void setData()
    {
        vi.setDataList(di.getData());
    }

    public void onListItemClicked()
    {

    }
}

