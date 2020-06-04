package com.example.virtualfittingroom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class HM extends AppCompatActivity implements View.OnClickListener {
Button btn_try1,btn_try2,btn_try3,btn_try4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_m);
        btn_try1 =(Button)findViewById(R.id.try1);
        btn_try2 =(Button)findViewById(R.id.try2);
        btn_try3 =(Button)findViewById(R.id.try3);
        btn_try4 =(Button)findViewById(R.id.try4);

        btn_try1.setOnClickListener(this);
        btn_try2.setOnClickListener(this);
        btn_try3.setOnClickListener(this);
        btn_try4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(),VirtualModel.class);
        startActivity(i);
    }
}
