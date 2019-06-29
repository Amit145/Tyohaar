package com.example.tyohaarconsole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class OFFICE_PROC_Supervisor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office__proc__supervisor);
        Toast.makeText(getApplicationContext(), getString(R.string.select_office_proc_supervisor), Toast.LENGTH_LONG).show();

    }
}
