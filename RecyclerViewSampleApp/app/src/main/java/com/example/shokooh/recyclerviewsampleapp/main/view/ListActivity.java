package com.example.shokooh.recyclerviewsampleapp.main.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shokooh.recyclerviewsampleapp.R;
import com.example.shokooh.recyclerviewsampleapp.main.data.FakeDataSource;
import com.example.shokooh.recyclerviewsampleapp.main.data.ListItem;
import com.example.shokooh.recyclerviewsampleapp.main.logic.Controller;

import java.util.List;

public class ListActivity extends AppCompatActivity implements viewInterface{

    private Controller ctrl ;
    private RecyclerView rv;
    private List<ListItem> data;
    private RecyclerView.Adapter adp;
    private LayoutInflater li ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ctrl = new Controller(this, new FakeDataSource());
        adp = new CustomAdapter();


    }

    @Override
    public void setData(List<ListItem> dataIn) {
        data = dataIn ;


    }

    // public ??
    public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>
    {
        // public ??
        public class CustomViewHolder extends RecyclerView.ViewHolder
        {
            public CustomViewHolder(View itemView) {
                super(itemView);
            }
        }

        @Override
        public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // inflate a view
            // create a handler with this view as input
            View v = li.Inflate(R.layout.item_data, parent, false);
            return null;
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, int position) {
            // data should be filled in
        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }
}
