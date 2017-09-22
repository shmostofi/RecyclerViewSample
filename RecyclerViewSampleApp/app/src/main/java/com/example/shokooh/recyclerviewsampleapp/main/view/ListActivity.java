package com.example.shokooh.recyclerviewsampleapp.main.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
    private CustomAdapter adp;
    private LayoutInflater li ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rv = (RecyclerView) findViewById(R.id.i_rvMain);
        li = getLayoutInflater();

        ctrl = new Controller(this, new FakeDataSource());
    }

    public void setDataList(List<ListItem> dataIn) {
        dataList = dataIn ;
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        adp = new CustomAdapter();
        rv.setAdapter(adp);
    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>
    {
        class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
        {
            private TextView tvDate;
            private TextView tvContent;
            private ImageView ivLogo;

            @Override
            public void onClick(View v) {
                // TODO : pass sth about the clicked item to ctrl
                ctrl.onListItemClicked();
            }

            public CustomViewHolder(View itemView) {
                super(itemView);
                tvDate = (TextView) itemView.findViewById(R.id.i_tvDate);
                tvContent = (TextView) itemView.findViewById(R.id.i_tvContent);
                ivLogo = (ImageView) itemView.findViewById(R.id.i_ivLogo);
            }
        }

        @Override
        public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = li.inflate(R.layout.item_data, parent, false);
            return new CustomViewHolder(v);
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, int position) {
            // dataList should be filled in
            ListItem currentItem = dataList.get(position);
            holder.tvDate.setText(currentItem.getDate());
            holder.tvContent.setText(currentItem.getContent());
            holder.ivLogo.setImageResource(currentItem.getColor());
        }

        @Override
        public int getItemCount() {
            return dataList.size();
        }
    }
}
