package com.archit.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView thingsToDo;
    CardView placesToGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thingsToDo=findViewById(R.id.card_view_things_to_do);
        placesToGo=findViewById(R.id.card_view_places_to_go);
        thingsToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thingsToDoIntent=new Intent(MainActivity.this,ThingsToDoActivity.class);
                startActivity(thingsToDoIntent);

            }
        });

        placesToGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesToGoIntent=new Intent(MainActivity.this, PlacesToGoActivity.class);
                startActivity(placesToGoIntent);

            }
        });


    }
}