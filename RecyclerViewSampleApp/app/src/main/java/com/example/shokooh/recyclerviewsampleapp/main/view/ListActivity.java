package com.example.shokooh.recyclerviewsampleapp.main.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shokooh.recyclerviewsampleapp.R;
import com.example.shokooh.recyclerviewsampleapp.main.data.FakeDataSource;
import com.example.shokooh.recyclerviewsampleapp.main.data.ListItem;
import com.example.shokooh.recyclerviewsampleapp.main.logic.Controller;

import java.util.List;

public class ListActivity extends AppCompatActivity implements viewInterface{

    private Controller ctrl ;
    private RecyclerView rv;
    private List<ListItem> dataList;
    private RecyclerView.Adapter adp;
    private LayoutInflater li ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ctrl = new Controller(this, new FakeDataSource());
        rv = (RecyclerView) findViewById(R.id.i_rvMain);
        li = getLayoutInflater();
    }

    public void setDataList(List<ListItem> dataIn) {
        dataList = dataIn ;
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        adp = new CustomAdapter();
        rv.setAdapter(adp);
    }

    // public ??
    public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>
    {
        // public ??
        public class CustomViewHolder extends RecyclerView.ViewHolder
        {
            private TextView tvDate;
            private TextView tvContent;
//            private
            // TODO : add color

            public CustomViewHolder(View itemView) {
                super(itemView);
                tvDate = (TextView) itemView.findViewById(R.id.i_tvDate);
                tvContent = (TextView) itemView.findViewById(R.id.i_tvContent);
            }
        }

        @Override
        public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // inflate a view
            // create a handler with this view as input
            View v = li.inflate(R.layout.item_data, parent, false);
            return new CustomViewHolder(v);
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, int position) {
            // dataList should be filled in
            ListItem currentItem = dataList.get(position);
            holder.tvDate.setText(currentItem.getDate());
            holder.tvContent.setText(currentItem.getContent());
        }

        @Override
        public int getItemCount() {
            return dataList.size();
        }
    }
}
