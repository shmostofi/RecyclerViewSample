package com.example.shokooh.recyclerviewsampleapp.main.logic;

import android.view.View;

import com.example.shokooh.recyclerviewsampleapp.main.data.ListItem;
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

    public void onListItemClick(ListItem li, View v)
    {
        vi.startDetailActivity(li.getContent(),
                li.getDate(),
                li.getColor(),
                v);
    }

    public void onListItemSwiped(int position, ListItem li)
    {
        vi.deleteListItem(position);
        di.deleteListItem(li);
    }

    public void onAddNewClicked(View v)
    {
        ListItem li = di.createNewItem();
        vi.addNewItem(li);
    }
}

