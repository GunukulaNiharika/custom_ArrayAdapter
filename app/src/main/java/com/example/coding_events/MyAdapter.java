package com.example.coding_events;

import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
       // import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.HashMap;

public class MyAdapter extends ArrayAdapter<Item> {

    ArrayList<Item> coding_events;

    public MyAdapter(Context context, int textViewResourceId, ArrayList<Item> item) {
        super(context, textViewResourceId, item);
        coding_events = item;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;


        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listItemView = inflater.inflate(R.layout.list_view_items, null);
        TextView host_name =listItemView.findViewById(R.id.hosturl);
        TextView comp_name= listItemView.findViewById(R.id.compname);
        TextView comp_time = listItemView.findViewById(R.id.comptime);
        host_name.setText(coding_events.get(position).getHostname());
        comp_name.setText(coding_events.get(position).getCompname());
        comp_time.setText(coding_events.get(position).getComptime());
        return listItemView;

    }

}