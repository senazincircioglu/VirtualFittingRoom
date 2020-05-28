package com.example.virtualfittingroom1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class VirtualModel extends AppCompatActivity {
Button btn_backVM, btn_updateModel;
ImageView img;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //get picture result
        Bundle b = data.getExtras();
        //image view area
        Bitmap bm = (Bitmap) b.get("data");
        //set imageview = bitmap
        img.setImageBitmap(bm);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual_model);
        img= (ImageView)findViewById(R.id.img_model);
        btn_updateModel =(Button)findViewById(R.id.btn_updateModel);
        btn_backVM = (Button)findViewById(R.id.btn_backVM);
        btn_backVM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainMenu.class);
                startActivity(intent);
            }
        });
        btn_updateModel =(Button)findViewById(R.id.btn_updateModel);
        btn_updateModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,1);
            }
        });

    }
}
