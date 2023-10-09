package com.example.androidlistusers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<UserModel>users = new ArrayList<UserModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RecyclerView recyclerView = findViewById(R.id.)

        ListView listView = findViewById(R.id.listView);
        UserAdapter userAdapter = new UserAdapter(this);
        listView.setAdapter((ListAdapter) userAdapter);
    }
}