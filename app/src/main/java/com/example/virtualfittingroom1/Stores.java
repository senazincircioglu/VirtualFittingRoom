package com.example.virtualfittingroom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stores extends AppCompatActivity {
Button btn_backStores, btn_store1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);
        btn_store1 = (Button)findViewById(R.id.btn_store1);
        btn_backStores = (Button)findViewById(R.id.btn_backStores);
        btn_backStores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainMenu.class);
                startActivity(intent);
            }
        });
        btn_store1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), HM.class);
                startActivity(i);
            }
        });
    }
}
