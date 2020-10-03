package com.example.pokimon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokimon> x = new ArrayList<>();
        pokimon p1 = new pokimon("strong",R.drawable.mpo,122,200,300);
        pokimon p2 = new pokimon("good",R.drawable.wee,122,150,400);
        pokimon p3 = new pokimon("ok",R.drawable.wrr,1150,180,500);
         pokimon.add(p1);
         pokimon.add(p2);
         pokimon.add(p3);

        RecyclerView e1 = findViewById(R.id.Recycl);



    }
}