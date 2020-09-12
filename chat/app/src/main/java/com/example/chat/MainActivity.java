package com.example.chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Intent intent = new Intent(MainActivity.this , selection.class);
        startActivity(intent);
    }
}
