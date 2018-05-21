package com.example.upshottechonologies.secondapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    String[] strings1;
    String[] strings2;
    Context context;
    int []img;
    public MyAdapter() {
    }

    public MyAdapter(Context context, String[] strings1, String[] strings2, int img[]) {
        this.context = context;
        this.strings1 = strings1;
        this.strings2 = strings2;
        this.img = img;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return strings1.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View view = layoutInflater.inflate(R.layout.list_item_row, parent, false);
        TextView t1 = view.findViewById(R.id.textView);
        TextView t2 = view.findViewById(R.id.text2);
        ImageView imageView = view.findViewById(R.id.image);
        imageView.setImageResource(img[position]);
        t1.setText(strings1[position]);
        t2.setText(strings2[position]);

        return view;
    }
}
