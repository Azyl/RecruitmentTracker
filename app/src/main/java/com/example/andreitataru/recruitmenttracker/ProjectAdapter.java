package com.example.andreitataru.recruitmenttracker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by andreitataru on 01/09/2017.
 */

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>{

    private int mNumberIntems;

    public ProjectAdapter (int numberOfItems){
        mNumberIntems = numberOfItems;
    }

    @Override
    public ProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.projects_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        ProjectViewHolder viewHolder = new ProjectViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ProjectViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberIntems;
    }


    class ProjectViewHolder extends RecyclerView.ViewHolder {
        TextView listItemProjectView;

        public ProjectViewHolder(View itemView) {
            super(itemView);

            listItemProjectView = itemView.findViewById(R.id.rv_proj_item_nr);
        }

        void bind(int listIndex){
            Log.d("Andrei" ,String.valueOf(listIndex));
            listItemProjectView.setText(String.valueOf(listIndex));
        }

    }

}
