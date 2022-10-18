package com.example.athkar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class gridAdapter extends BaseAdapter {
    Context context;
    String[] flowername;
    int[] img;
    LayoutInflater inflater;
    public gridAdapter(Context context, String[] flowername, int[] img) {
        this.context = context;
        this.flowername = flowername;
        this.img = img;
    }

    @Override
    public int getCount() {
        return flowername.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(inflater==null)
            inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if(view==null)
        {
            view=inflater.inflate(R.layout.grid_item,null);
        }
        ImageView imageView=view.findViewById(R.id.grid_image);
        TextView textView=view.findViewById(R.id.item_name);
        imageView.setImageResource(img[i]);
        textView.setText(flowername[i]);
        return view;
    }
}
