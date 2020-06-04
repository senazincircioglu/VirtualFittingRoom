package com.example.virtualfittingroom1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class UpdateProfile extends AppCompatActivity {
    //Buttons
    Button btnSave, btnCancel, btn_back;
    EditText userName, password, age, email;
    RadioGroup gender;
   //Spinner(Combobox) String
    private String[] upperSizes ={"XS", "S","M","L", "XL", "XXL"};
    private String[] lowerSizes ={"32","34","36","38","40","42","44","46","48"};
    //Spinners:
    Spinner upperBody, lowerBody;
    private ArrayAdapter<String> dataAdapterForUpper;
    private ArrayAdapter<String> dataAdapterForLower;
    //string to send profile activity
    String sendUser, sendPassword, sendEmail, sendAge, sendGender, sendUpperSize, sendLowerSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        upperBody = (Spinner) findViewById(R.id.upperbody);
        lowerBody = (Spinner) findViewById(R.id.lowerbody);

        dataAdapterForUpper = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, upperSizes);
        dataAdapterForLower = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,lowerSizes);

        dataAdapterForUpper.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterForLower.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        upperBody.setAdapter(dataAdapterForUpper);
        lowerBody.setAdapter(dataAdapterForLower);
        //identfyinf edittext
        userName = (EditText)findViewById(R.id.edt_userName);
        password = (EditText)findViewById(R.id.edt_password);
        email= (EditText)findViewById(R.id.edt_email);
        age = (EditText)findViewById(R.id.edt_age);

        //identfying radiogrup
        gender = (RadioGroup)findViewById(R.id.rGroup_gender);
        //identifying buttons
        btnSave =(Button)findViewById(R.id.btn_Save);
        btnCancel =(Button)findViewById(R.id.btn_Cancel);
        btn_back =(Button)findViewById(R.id.btn_back);

 // get user name , password, email and gender info
       sendUser = userName.getText().toString();
        sendPassword = password.getText().toString();
        sendEmail = email.getText().toString();
        sendAge = age.getText().toString();
        sendGender = ((RadioButton)findViewById(gender.getCheckedRadioButtonId())).getText().toString();
        sendUpperSize =upperBody.getSelectedItem().toString();
        sendLowerSize =lowerBody.getSelectedItem().toString();

        btnSave_Click();
        btnCancel_Click();

btn_back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(),profile.class);
        startActivity(i);
    }
});
    }

    public void btnSave_Click(){
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),profile.class);
                i.putExtra("user",sendUser);
                i.putExtra("password",sendPassword);
                i.putExtra("email",sendEmail);
                i.putExtra("age",sendAge);
                i.putExtra("gender",sendGender);
                i.putExtra("upper",sendUpperSize);
                i.putExtra("lower",sendLowerSize);
                startActivity(i);
            }
        });
    }
    public void btnCancel_Click(){
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),profile.class);
                startActivity(i);
            }
        });
    }
}
