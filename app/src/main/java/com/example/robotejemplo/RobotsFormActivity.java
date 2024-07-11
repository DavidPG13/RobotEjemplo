package com.example.robotejemplo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.robotejemplo.data.Robot;
import com.example.robotejemplo.data.RobotHandler;
import com.example.robotejemplo.databinding.ActivityRobotsFormBinding;
import com.google.android.material.snackbar.Snackbar;

public class RobotsFormActivity extends AppCompatActivity  implements View

        .OnClickListener{


    private EditText edtRobotid;

    private ActivityRobotsFormBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        edtRobotid = findViewById(R.id.edt_robotid);

        binding = ActivityRobotsFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter<CharSequence> spnAdapter =
                ArrayAdapter.createFromResource (
                         this, R.array.gropus, android.R.layout.simple_spinner_item);
        spnAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        binding.spnGroup.setAdapter(spnAdapter);

        binding.fab.setOnClickListener(this);

    }
    private Robot readRobotForm() {
        Robot newRobot = new Robot();
        String name = binding.edtName.getText().toString();
        newRobot.setName(name);
        newRobot.setDescripcion(binding.edtDesc.getText().toString());
        newRobot.setGroup(binding.spnGroup.getSelectedItem().toString());

        int participation = 0;
        if (binding.rdbDesing.isChecked()) {
            participation = 1;
        } else if (binding.rdbRace.isChecked()) {
            participation = 2;
         }

        newRobot.setParticipation (participation);

        int functions = 0;
        if (binding.chkLight.isChecked()) {
            functions += 1;
        }
        if (binding.chkSound.isChecked()) {
            functions += 2;
         }
        if (binding.chkSensor.isChecked()) {
            functions += 4;
        }
        newRobot.setFunctions (functions);

        return  newRobot;
    }

    @Override
    public void onClick(View view) {
        Log.d("INSERT", "inicio");
        Robot newRobot = readRobotForm();
        RobotHandler myDB = new RobotHandler(this);
        Log.d("INSERT", "conexión");
        long newId = myDB.insertRobot(newRobot);
        Log.d("INSERT", "insertar:" + newId);
        if (newId > 0) {
            Snackbar.make(view, "¡Robot " + newId + " inserted!",
                    Snackbar.LENGTH_LONG).show();
        } else {
            Snackbar.make(view, "¡Insertion error!",
                    Snackbar.LENGTH_LONG).show();
        }
    }
}