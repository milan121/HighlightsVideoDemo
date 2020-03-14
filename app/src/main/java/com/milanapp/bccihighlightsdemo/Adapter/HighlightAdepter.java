package com.milanapp.bccihighlightsdemo.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.milanapp.bccihighlightsdemo.Main2Activity;
import com.milanapp.bccihighlightsdemo.MainActivity;
import com.milanapp.bccihighlightsdemo.Model.Content;
import com.milanapp.bccihighlightsdemo.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HighlightAdepter extends RecyclerView.Adapter<HighlightAdepter.HighlightViewHolder> {
    Context context;
    List<Content> contentList = new ArrayList<>();


    public HighlightAdepter(Context context, List<Content> contentList) {
        this.context = context;
        this.contentList = contentList;

    }

    @NonNull
    @Override
    public HighlightViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.raw_item,parent,false);
        final HighlightViewHolder holder =new HighlightViewHolder(view);


        holder.item_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);

                intent.putExtra("video","https://secure.brightcove.com/services/mobile/streaming/index/master.m3u8?videoId="+contentList.get(holder.getAdapterPosition()).getMediaId()+"&pubId=3588749423001&secure=true");
                context.startActivity(intent);

            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HighlightViewHolder holder, int position) {
        holder.title_thumnail.setText(contentList.get(position).getTitle());
        Glide.with(context).load(contentList.get(position).getThumbnailUrl()).into(holder.thumnail);

    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    public  static final class HighlightViewHolder extends RecyclerView.ViewHolder{

        ImageView thumnail;
        TextView title_thumnail;
        RelativeLayout item_container;
        public HighlightViewHolder(@NonNull View itemView) {
            super(itemView);

            thumnail = itemView.findViewById(R.id.thumnail);
            title_thumnail=itemView.findViewById(R.id.title_thumnail);
            item_container = itemView.findViewById(R.id.item_relative);
        }
    }
}
