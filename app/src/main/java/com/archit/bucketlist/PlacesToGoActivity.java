package com.archit.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        RecyclerView RV=findViewById(R.id.places_to_go_RV);
        BucketList[] placesToGoBucketList={

                new BucketList("Amazon", "Immerse yourself in the lush wonders of the Amazon rainforest, teeming with incredible biodiversity and awe-inspiring landscapes.",R.drawable.amazon,3),
                new BucketList("Iceland", "Witness the raw beauty of Iceland, from majestic waterfalls to stunning glaciers, and soak in geothermal hot springs under the dancing Northern Lights.",R.drawable.iceland,3),
                new BucketList("Japan", "Embark on a cultural odyssey in Japan, where ancient traditions blend seamlessly with futuristic innovation, offering a unique and captivating experience.",R.drawable.japan,4.5f),
                new BucketList("Kerala", "Unwind amidst the serene backwaters, lush greenery, and tranquil beaches of Kerala, immersing yourself in the beauty and tranquility of this South Indian gem.",R.drawable.kerala,5),
                new BucketList("Vietnam", "Embark on an enchanting journey through Vietnam, from the bustling streets of Hanoi to the picturesque landscapes of Halong Bay, and delve into its rich history and vibrant culture.",R.drawable.vietnam,5)

        };
        BucketListAdapter adapter=new BucketListAdapter(placesToGoBucketList);
        RV.setAdapter(adapter);


    }
}