package com.example.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class studentsettings extends AppCompatActivity {
    //Array of strings
    String[] listArray ={"Account","Log Out"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentsettings);
        ArrayAdapter adapter= new ArrayAdapter<String>(this,R.layout.activity_studentsettings,listArray);
        ListView listView=(ListView) findViewById(R.id.studentsettinglist);
        listView.setAdapter(adapter);


    }
}
