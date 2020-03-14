package com.milanapp.bccihighlightsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.milanapp.bccihighlightsdemo.Adapter.HighlightAdepter;
import com.milanapp.bccihighlightsdemo.Model.Content;
import com.milanapp.bccihighlightsdemo.Model.Highlights;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  static final String URL = "https://api.platform.bcci.tv/content/bcci/video/EN/?tagNames=highlights&pageSize=20&page=0";
    private RecyclerView recyclerView;
    private List<Content> mContentListlist;

    private HighlightAdepter highlightAdepter;
    private RequestQueue requestQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        mContentListlist = new ArrayList<>();


        recyclerView.setHasFixedSize(true);
        highlightAdepter = new HighlightAdepter(this,mContentListlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(highlightAdepter);
        JsonRequest();

    }


    private void JsonRequest() {

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.serializeNulls().create();

                Highlights highlights = gson.fromJson(response,Highlights.class);

                mContentListlist.clear();

                mContentListlist.addAll(highlights.getContent());
                highlightAdepter.notifyDataSetChanged();




            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });

        requestQueue = Volley.newRequestQueue(MainActivity.this);
        requestQueue.add(stringRequest);
    }



}
