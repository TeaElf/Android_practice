package com.example.tea.helloworld.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tea.helloworld.R;

import java.util.ArrayList;

import static android.support.v7.app.AlertController.*;

public class NoviActivity extends AppCompatActivity {

  //  ListView listView;
    private int previousPosition = -1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novi);

      //  listView = findViewById(R.id.listView);

        //logika ucitavanja nekih podataka (korisnici, majstori itd...)
        ArrayList<String> arrayList = new ArrayList<>();
        String name = "Zahtev ";

        for (Integer taskId = 1; taskId<20; taskId++)
            arrayList.add(name+taskId);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
/*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(previousPosition == -1) {
                    view.setBackgroundColor(getColor(R.color.colorAccent));
                    previousPosition = i;
                } else {
                    adapterView.getChildAt(previousPosition).setBackgroundColor(getColor(R.color.white));
                    view.setBackgroundColor(getColor(R.color.colorAccent));
                    previousPosition = i;
                }
                Toast.makeText(NoviActivity.this, "position: " + i, Toast.LENGTH_SHORT).show();
            }
        });

        //logika gde se u neki LISTVIEW ili RECYCLERVIEW nasetuju ti isti podaci ne bi li se prikazali
        listView.setAdapter(arrayAdapter);*/
/*
        RecycleListView recycleListView = findViewById(R.id.recyclerView);
        recycleListView.setOnClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(previousPosition == -1) {
                    view.setBackgroundColor(getColor(R.color.colorAccent));
                    previousPosition = i;
                } else {
                    adapterView.getChildAt(previousPosition).setBackgroundColor(getColor(R.color.white));
                    view.setBackgroundColor(getColor(R.color.colorAccent));
                    previousPosition = i;
                }
                Toast.makeText(NoviActivity.this, "position: " + i, Toast.LENGTH_SHORT).show();
            }
        });*/
    }


}
