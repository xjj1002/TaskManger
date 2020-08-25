package com.example.taskmanager;

import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class TaskTab extends Fragment {

    //on create view it returns the tasks tab layout
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.task_tab, container, false);
        return view;
    }
}
