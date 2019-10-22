package com.example.rocketsquirrel2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void nextPage(View view){
        Intent intent = new Intent(this, End.class);
        startActivity(intent);
    }

    public void failPage(View view){
        Intent intent = new Intent(this, Fail3.class);
        startActivity(intent);
    }
}
