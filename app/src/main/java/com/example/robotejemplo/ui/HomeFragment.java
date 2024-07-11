package com.example.robotejemplo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.robotejemplo.RobotsFormActivity;
import com.example.robotejemplo.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnRobots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Opens the Robots managament views
                Log.d("HOME", "Robots click");
                Toast.makeText(getContext(), "Manage Robots!", Toast.LENGTH_SHORT).show();
                Intent formIntent = new Intent(getContext(), RobotsFormActivity.class);
                startActivity(formIntent);
            }
        });

        binding.btnStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Opens the Students managament views
                Log.d("HOME", "Participants click");
                Toast.makeText(getContext(), "Manage Participants!", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}