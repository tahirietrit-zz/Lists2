package com.tahirietrit.lists;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by macb on 06/12/17.
 */

public class ListaAdapter extends BaseAdapter {
    LayoutInflater inflater;
    ArrayList<String> strings = new ArrayList<>();

    public ListaAdapter(LayoutInflater inflater){
     this.inflater = inflater;
    }
    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return strings.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            view = inflater.inflate(R.layout.list_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.positionTextView.setText(strings.get(position));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strings.remove(position);
                notifyDataSetChanged();
            }
        });

        return view;
    }
    class ViewHolder{
        TextView positionTextView;
        public ViewHolder(View v){
            positionTextView = (TextView) v.findViewById(R.id.position_textview);
        }
    }


}
