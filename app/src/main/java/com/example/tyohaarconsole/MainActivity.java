package com.example.tyohaarconsole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAdmin(View view) {

        Intent intent = new Intent(getApplicationContext(),Admin.class);
        startActivity(intent);
    }

    public void onClickAPMC(View view) {

        Intent intent = new Intent(getApplicationContext(),APMC.class);
        startActivity(intent);

    }

    public void onClickCCProc(View view) {

        Intent intent = new Intent(getApplicationContext(),CC_Proc_Lead.class);
        startActivity(intent);

    }

    public void onClickCCSupervisor(View view) {

        Intent intent = new Intent(getApplicationContext(),CC_Supervisor.class);
        startActivity(intent);

    }

    public void onClickCCVehicleDriver(View view) {

        Intent intent = new Intent(getApplicationContext(),CC_Vehicle_Driver.class);
        startActivity(intent);

    }

    public void onClickFCSupervisor(View view) {

        Intent intent = new Intent(getApplicationContext(),FC_Supervisor.class);
        startActivity(intent);

    }

    public void onClickFCVehicleDriver(View view) {

        Intent intent = new Intent(getApplicationContext(),FC_Vehicle_Driver.class);
        startActivity(intent);

    }

    public void onClickOfficeprocSupervisor(View view) {

        Intent intent = new Intent(getApplicationContext(),OFFICE_PROC_Supervisor.class);
        startActivity(intent);

    }

    public void onClickShopStaff(View view) {

        Intent intent = new Intent(getApplicationContext(),Shop_Staff.class);
        startActivity(intent);

    }


}
