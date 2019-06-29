package com.example.tyohaarconsole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Shop_Staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop__staff);
        Toast.makeText(getApplicationContext(), getString(R.string.select_shop_staff), Toast.LENGTH_LONG).show();

    }
}
