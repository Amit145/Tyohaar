package com.example.tyohaarconsole;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class APMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apmc);
        isFirstTime();
        //Toast.makeText(getApplicationContext(), getString(R.string.select_apmc_proc_lead), Toast.LENGTH_LONG).show();

    }

    private void isFirstTime()
    {
        SharedPreferences sp = getSharedPreferences("PROFILE", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("PROFILE_TYPE", getString(R.string.select_apmc_proc_lead));
        editor.apply();
    }

}
