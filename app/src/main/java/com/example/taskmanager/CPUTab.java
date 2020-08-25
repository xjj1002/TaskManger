package com.example.taskmanager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

//tab that focuses on CPU Utilization
public class CPUTab extends Fragment {

    //on create view it returns the the cpu tab layout
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cpu_tab, container, false);
        return view;
    }
}


