package com.example.taskmanager;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.taskmanager.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView pidView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);


        //finding the view by the list view id (pid_list)
        pidView = (ListView)findViewById(R.id.pid_list);

        //creating the array for the processes
        ArrayList<String> pidList = new ArrayList<>();

        //adding some string text for testing in the pid list
        pidList.add("come on");
        pidList.add("please");
        pidList.add("work");
        pidList.add("work");
        pidList.add("work");

        //source for ArrayAdapter:
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.activity_list_item,pidList);
        pidView.setAdapter(arrayAdapter);

    }
}