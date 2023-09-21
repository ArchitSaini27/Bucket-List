package com.archit.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        RecyclerView RV=findViewById(R.id.things_to_do_RV);

        BucketList[] thingsToDoBucketList={
                new BucketList("Kilimanjaro", "Conquer Africa's highest peak and witness breathtaking views from the top.",R.drawable.kilimanjaro,3.5f),
                new BucketList("Northern Lights", "Marvel at the ethereal dance of vibrant colors in the night sky.",R.drawable.northern_lights,4),
                new BucketList("Road Trip", "Embark on an epic adventure, exploring new destinations and creating unforgettable memories along the way.",R.drawable.road_trip,5),
                new BucketList("Scuba Dive", "Dive into a mesmerizing underwater world, discovering vibrant marine life and stunning coral reefs.",R.drawable.scubadive,2.5f),
                new BucketList("Skydive", "Experience the ultimate thrill as you freefall through the sky and embrace an adrenaline-fueled adventure.",R.drawable.skydive,3)
        };
        BucketListAdapter adapter=new BucketListAdapter(thingsToDoBucketList);
        RV.setAdapter(adapter);





    }
}