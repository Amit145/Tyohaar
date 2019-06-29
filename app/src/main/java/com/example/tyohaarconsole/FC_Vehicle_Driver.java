package com.example.tyohaarconsole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class FC_Vehicle_Driver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fc__vehicle__driver);
        Toast.makeText(getApplicationContext(), getString(R.string.select_fc_vehicle_driver), Toast.LENGTH_LONG).show();

    }
}
