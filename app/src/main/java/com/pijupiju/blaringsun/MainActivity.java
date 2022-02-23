package com.pijupiju.blaringsun;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pijupiju.blaringsun.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.pijupiju.blaringsun.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}