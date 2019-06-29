package com.example.tyohaarconsole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CC_Proc_Lead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc__proc__lead);
        Toast.makeText(getApplicationContext(), getString(R.string.select_cc_proc_lead), Toast.LENGTH_LONG).show();

    }
}
