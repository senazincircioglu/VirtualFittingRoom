package com.example.virtualfittingroom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Button btn_toStores, btn_toWardrop, btn_toProfile, btn_toModel, btn_toBarcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_toStores = (Button) findViewById(R.id.btn_mainToStores);
        btn_toWardrop = (Button) findViewById(R.id.btn_mainToWardrobe);
        btn_toProfile = (Button) findViewById(R.id.btn_mainToProfile);
        btn_toModel = (Button) findViewById(R.id.btn_mainToModel);
        btn_toBarcode = (Button) findViewById(R.id.btn_mainToBarcode);

        btnToStoresClick();
        btnToWardropClick();
        btnToProfileClick();
        btnToModelClick();
        btnToBarcodeClick();

    }

    public void btnToStoresClick() {
        btn_toStores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Stores.class);
                startActivity(intent);
            }
        });
    }

    public void btnToWardropClick(){
        btn_toWardrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Wardrop.class);
                startActivity(intent);
            }
        });
    }
    public void btnToProfileClick() {
        btn_toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), profile.class);
                startActivity(intent);
            }
        });
    }
    public void btnToModelClick() {
        btn_toModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VirtualModel.class);
                startActivity(intent);
            }
        });
    }
    public void btnToBarcodeClick(){
        btn_toBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Barcode.class);
                startActivity(intent);
            }
        });
    }
}
