package com.example.andreitataru.recruitmenttracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ProjectsActivity extends AppCompatActivity {

    private static final int PROJ_LIST_ITEMS = 100;
    private ProjectAdapter mAdapter;
    private RecyclerView   mProjectsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);



        mProjectsList = (RecyclerView) findViewById(R.id.rv_projects);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mProjectsList.setLayoutManager(layoutManager);
        mProjectsList.setHasFixedSize(true);

        mAdapter = new ProjectAdapter(PROJ_LIST_ITEMS);

        mProjectsList.setAdapter(mAdapter);


    }
}
