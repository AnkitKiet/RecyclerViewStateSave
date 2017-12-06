package edu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerViewCategory = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewCategory.setLayoutManager(layoutManager);
        recyclerViewCategory.setHasFixedSize(true);
        ArrayList<String> category = new ArrayList<>(Arrays.asList("1", "2", "3,", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "!7", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"));
        CustomAdapter customAdapterDashboardCategory = new CustomAdapter(this, category);
        recyclerViewCategory.setAdapter(customAdapterDashboardCategory);


    }
}
