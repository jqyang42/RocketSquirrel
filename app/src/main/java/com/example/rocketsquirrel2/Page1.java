package com.example.rocketsquirrel2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }

    public void nextPage(View view){
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }

    public void failPage(View view){
        Intent intent = new Intent(this, Fail1.class);
        startActivity(intent);
    }
}
