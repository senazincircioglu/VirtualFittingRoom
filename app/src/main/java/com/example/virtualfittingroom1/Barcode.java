package com.example.virtualfittingroom1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Barcode extends AppCompatActivity {
Button btn_back, btn_tryAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);
        btn_back =(Button)findViewById(R.id.btn_barcodeBack);
        btn_tryAgain =(Button)findViewById(R.id.btn_barcodeTryagain);
        scanCode();
btn_back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(),MainMenu.class);
        startActivity(i);
    }
});
btn_tryAgain.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        scanCode();
    }
});


    }
private  void scanCode(){
    IntentIntegrator integrator = new IntentIntegrator(this);
    integrator.setCaptureActivity(CaptureAct.class);
    integrator.setOrientationLocked(false);
    integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
    integrator.setPrompt("Scanning Code");
    integrator.setTimeout(10000);
    integrator.initiateScan();
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null){
            if(result.getContents() != null){
                Intent intent = new Intent(getApplicationContext(),showClothes.class);
                String clothesID=result.getContents().toString();
                intent.putExtra("clothesID",clothesID);
                startActivity(intent);
            }
            else{
                Toast.makeText(this,"No Result",Toast.LENGTH_LONG).show();
            }
        }
        else {
            super.onActivityResult(requestCode,resultCode,data);
        }

    }
}
