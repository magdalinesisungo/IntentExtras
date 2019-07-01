package com.example.intentextras;

import android.app.Notification;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Toolbar toolbar = findViewById(R.id.toolbar);










        setSupportActionBar(toolbar);

        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
