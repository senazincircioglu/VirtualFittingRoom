package com.example.virtualfittingroom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wardrop extends AppCompatActivity {
Button btn_backWardrop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wardrop);
        btn_backWardrop = (Button)findViewById(R.id.btn_backWardrop);
        btn_backWardrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainMenu.class);
                startActivity(intent);
            }
        });
    }
}
