package com.example.virtualfittingroom1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class profile extends AppCompatActivity {
Button btn_backProfile, btn_updateProfile;
TextView user, password, email, age, gender, upper, lower;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
btn_backProfile = (Button)findViewById(R.id.btn_backProfile);
btn_backProfile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(getApplicationContext(),MainMenu.class);
        startActivity(intent);
    }
});
btn_updateProfile = (Button)findViewById(R.id.editProfile);
        user = (TextView) findViewById(R.id.txuser);
        password = (TextView) findViewById(R.id.txtPassword);
        email = (TextView) findViewById(R.id.txtEmail);
        age = (TextView) findViewById(R.id.txtAge);
        gender = (TextView) findViewById(R.id.txtGender);
        upper = (TextView) findViewById(R.id.txtUpper);
        lower = (TextView) findViewById(R.id.txtLower);
btn_updateProfile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), UpdateProfile.class);
        startActivity(i);

    }
});

    }
}
