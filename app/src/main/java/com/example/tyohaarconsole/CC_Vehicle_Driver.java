package com.example.tyohaarconsole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CC_Vehicle_Driver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc__vehicle__driver);
        Toast.makeText(getApplicationContext(), getString(R.string.select_cc_vehicle_driver), Toast.LENGTH_LONG).show();

    }
}
