package com.example.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;


public class selection extends AppCompatActivity {
    ImageButton counsellorimage;
    ImageButton studentimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        addListenerOnButton();

    }

    public void addListenerOnButton(){
        counsellorimage = (ImageButton) findViewById(R.id.imageButton2);
        studentimage = (ImageButton) findViewById(R.id.imageButton3);
        counsellorimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this, LoginActivity.class);
                startActivity(intent);

            }

        });
        studentimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this, studentlogin.class);
                startActivity(intent);

            }

        });


    }


}
