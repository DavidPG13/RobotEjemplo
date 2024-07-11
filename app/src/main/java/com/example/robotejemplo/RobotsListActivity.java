package com.example.robotejemplo;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.robotejemplo.databinding.ActivityRobotsListBinding;

public class RobotsListActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    private ActivityRobotsListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRobotsListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       setSupportActionBar(binding.toolbar1);



        binding.toolbar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });


    }


}