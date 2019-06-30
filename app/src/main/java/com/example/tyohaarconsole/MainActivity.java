package com.example.tyohaarconsole;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sp = getSharedPreferences("PROFILE", MODE_PRIVATE);
        String profile = sp.getString("PROFILE_TYPE", "");

        Toast.makeText(getApplicationContext(), profile, Toast.LENGTH_LONG).show();

        if(profile.equalsIgnoreCase(getString(R.string.select_admin))) {

            setContentView(R.layout.activity_admin);

        } else if(profile.equalsIgnoreCase(getString(R.string.select_cc_proc_lead))) {

            setContentView(R.layout.activity_cc__proc__lead);

        } else if(profile.equalsIgnoreCase(getString(R.string.select_cc_supervisor))) {

            setContentView(R.layout.activity_cc__supervisor);

        } else if(profile.equalsIgnoreCase(getString(R.string.select_apmc_proc_lead))) {

            setContentView(R.layout.activity_apmc);

        } else if(profile.equalsIgnoreCase(getString(R.string.select_fc_supervisor))) {

            setContentView(R.layout.activity_fc__supervisor);

        } else if(profile.equalsIgnoreCase(getString(R.string.select_cc_vehicle_driver))) {

            setContentView(R.layout.activity_cc__vehicle__driver);

        } else if(profile.equalsIgnoreCase(getString(R.string.select_fc_vehicle_driver))) {

            setContentView(R.layout.activity_fc__vehicle__driver);

        } else if(profile.equalsIgnoreCase(getString(R.string.select_shop_staff))) {

            setContentView(R.layout.activity_shop__staff);

        } else if(profile.equalsIgnoreCase(getString(R.string.select_office_proc_supervisor))) {

            setContentView(R.layout.activity_office__proc__supervisor);

        }  else {

            setContentView(R.layout.activity_main);
        }

    }

    public void onClickAdmin(View view) {

        Intent intent = new Intent(getApplicationContext(),Admin.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void onClickAPMC(View view) {

        Intent intent = new Intent(getApplicationContext(),APMC.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void onClickCCProc(View view) {

        Intent intent = new Intent(getApplicationContext(),CC_Proc_Lead.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void onClickCCSupervisor(View view) {

        Intent intent = new Intent(getApplicationContext(),CC_Supervisor.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void onClickCCVehicleDriver(View view) {

        Intent intent = new Intent(getApplicationContext(),CC_Vehicle_Driver.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void onClickFCSupervisor(View view) {

        Intent intent = new Intent(getApplicationContext(),FC_Supervisor.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void onClickFCVehicleDriver(View view) {

        Intent intent = new Intent(getApplicationContext(),FC_Vehicle_Driver.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void onClickOfficeprocSupervisor(View view) {

        Intent intent = new Intent(getApplicationContext(),OFFICE_PROC_Supervisor.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    public void onClickShopStaff(View view) {

        Intent intent = new Intent(getApplicationContext(),Shop_Staff.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }


}
