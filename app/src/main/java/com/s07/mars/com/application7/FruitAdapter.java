package com.s07.mars.com.application7;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/1/20.
 */
public class FruitAdapter extends ArrayAdapter {

    private int resourceId;

    public FruitAdapter(MainActivity context, int resource, List<Fruit> objects) {
        super(context, resource,objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = (Fruit) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        TextView fruitname = (TextView)view.findViewById(R.id.fruit_text);
        ImageView fruitimage = (ImageView)view.findViewById(R.id.fruit_image);
        fruitname.setText(fruit.getName());
        fruitimage.setImageResource(fruit.getId());
        Log.d("111","1111");
        return  view;
    }
}
