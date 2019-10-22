package com.example.rocketsquirrel2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fail3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail3);
    }

    public void backPage(View view){
        Intent intent = new Intent(this, Page3.class);
        startActivity(intent);
    }
}
