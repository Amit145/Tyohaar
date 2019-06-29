package com.example.tyohaarconsole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class APMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apmc);

        Toast.makeText(getApplicationContext(), getString(R.string.select_apmc_proc_lead), Toast.LENGTH_LONG).show();

    }
}
