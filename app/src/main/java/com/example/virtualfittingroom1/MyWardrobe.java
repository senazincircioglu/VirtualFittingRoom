package com.example.virtualfittingroom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyWardrobe extends AppCompatActivity {
    Button btn_backWardrobe, btn_try;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wardrobe);
        btn_backWardrobe = (Button)findViewById(R.id.btn_backWardrobe);
        btn_try = (Button)findViewById(R.id.btn_tryWardrobe);
        btn_try.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),VirtualModel.class);
                startActivity(intent);
            }
        });
        btn_backWardrobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainMenu.class);
                startActivity(intent);
            }
        });
    }
    }

