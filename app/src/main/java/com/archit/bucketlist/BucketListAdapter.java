package com.archit.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.BucketListViewHolder> {

    private BucketList[] bucketLists;

    BucketListAdapter(BucketList[] bucketLists){
        this.bucketLists=bucketLists;

    }

    @Override
    public int getItemCount() {
        return bucketLists.length;
    }

    @NonNull
    @Override
    public BucketListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item,parent,false);
        return new BucketListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListViewHolder holder, int position) {
        holder.bind(bucketLists[position]);

    }



    static class BucketListViewHolder extends RecyclerView.ViewHolder{
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;
        RatingBar ratingBar;

        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage=itemView.findViewById(R.id.image_view_item);
            appTitle=itemView.findViewById(R.id.text_view_title);
            appDescription=itemView.findViewById(R.id.text_view_description);
            ratingBar=itemView.findViewById(R.id.rating_bar);
        }

        public void bind(BucketList bucket){
            appTitle.setText(bucket.title);
            appImage.setImageResource(bucket.image);
            appDescription.setText(bucket.description);
            ratingBar.setRating(bucket.rating);


        }

    }
}
