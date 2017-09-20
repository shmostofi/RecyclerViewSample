package com.example.shokooh.recyclerviewsampleapp.main.logic;

import com.example.shokooh.recyclerviewsampleapp.main.data.dataInterface;
import com.example.shokooh.recyclerviewsampleapp.main.view.viewInterface;

/**
 * Created by smostofi on 18/09/2017.
 */

public class Controller {

/*
    * View does not make requests.
    * it just create instance of ctrl
    * ctrl does the job itself, provide data etc.
    * DUTY of ctrl is to just pass commands to different modules
*/

    private viewInterface vi;
    private dataInterface di;

    public Controller(viewInterface view, dataInterface data) {
        vi = view ;
        di = data ;
        setData();
    }

    private void setData()
    {
        vi.setDataList(di.getData());

    }
}

