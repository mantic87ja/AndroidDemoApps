package com.example.animationsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



     /*   Glide.with(this)
                .load(R.drawable.gif)
                .centerCrop()
                .into((ImageView) findViewById(R.id.imgGetPremium));
*/


        RecyclerView recyclerView = findViewById(R.id.rvAnimation);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter adapter = new CustomAdapter();
        recyclerView.setAdapter(adapter);

    }
}