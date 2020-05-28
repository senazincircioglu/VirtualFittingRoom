package com.example.virtualfittingroom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class showClothes extends AppCompatActivity {
ImageView img;
TextView name, color, size;
Button btntoModel, btnBackMain, btnBackScanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_clothes);

        btntoModel=(Button)findViewById(R.id.btn_toModel) ;
        btnBackMain=(Button)findViewById(R.id.btn_backMain) ;
        btnBackScanner=(Button)findViewById(R.id.btn_backScanner) ;
        img =(ImageView)findViewById(R.id.clothes);
        name=(TextView)findViewById(R.id.name);
        size=(TextView)findViewById(R.id.size);
        color=(TextView)findViewById(R.id.color);

        getDataFromScanner();
        btnBackScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Barcode.class);
                startActivity(i);
            }
        });
        btnBackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainMenu.class);
                startActivity(i);
            }
        });
        btntoModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),VirtualModel.class);
                startActivity(i);
            }
        });
    }
    public void getDataFromScanner(){
        Bundle bundle = getIntent().getExtras();
        String clothesId= bundle.getString("clothesID");
        switch (clothesId){
            case "12345":
                img.setImageResource(R.drawable.store1dress);
                name.setText("Mini Dress with Polka Dot");
                size.setText("Small");
                color.setText("Powder Pink"); break;
            case "5678":
                img.setImageResource(R.drawable.store1pant);
                name.setText("Basic Pants");
                size.setText("34");
                color.setText("Grey"); break;
            case "9000":
                img.setImageResource(R.drawable.store1tshirt);
                name.setText("Grande Amour Tshirt");
                size.setText("Medium");
                color.setText("Black"); break;
            default: break;
        }
    }
}
