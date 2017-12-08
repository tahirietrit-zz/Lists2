package com.tahirietrit.lists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListaAdapter adapter;
    ArrayList<String> strings = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);
        adapter = new ListaAdapter(getLayoutInflater());
        listView.setAdapter(adapter);
        for (int i = 0; i < 100; i++) {
            strings.add("position "+ (i+1));
        }
        adapter.setStrings(strings);
    }
}
