package com.example.coding_events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> coding_events = new ArrayList<>();
        listView= findViewById(R.id.simplelistview);

        coding_events.add(new Item("hackerearth.com","Data Structures and Algorithms Coding Contest","1h 30m"));
        coding_events.add(new Item("codeforces.com","Codeforces Round #639(Div.1)","2h 15m"));
        coding_events.add(new Item("codechef.com","May Launchtime 2020","3h"));
        coding_events.add(new Item("hackerearth.com","Kotlin Code Quest with JetBrains","2days 7h 59m"));
        coding_events.add(new Item("codeforces.com","Kotlin Heroes:Practice 4","7days"));
        coding_events.add(new Item("hackerearth.com","Novartis Data Science Hiring Challenge","16days 7h 59m"));

       MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,coding_events);
        listView.setAdapter(myAdapter);

    }
}
