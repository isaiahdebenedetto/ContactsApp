package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class editContact extends AppCompatActivity {

    Button btn_confirm, btn_cancel;
    TextView tv_editText;
    //TextInputLayout til_getFName, til_getLName, til_getPhone, til_getStreet, til_getCity,
    //        til_getState, til_getEmail, til_getDesc;
    //TextInputEditText ti_getFName, ti_getLName, ti_getPhone, ti_getStreet, ti_getCity, ti_getState,
    //    ti_getEmail, ti_getDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        btn_cancel = findViewById(R.id.btn_cancel);
        btn_confirm = findViewById(R.id.btn_confirm);
        tv_editText = findViewById(R.id.tv_editText);
        //til_getFName = findViewById(R.id.ti_getFName);
        //til_getLName = findViewById(R.id.ti_getLName);
        //til_getPhone = findViewById(R.id.ti_getPhone);
        //til_getStreet = findViewById(R.id.ti_getStreet);
        //til_getCity = findViewById(R.id.ti_getCity);
        //til_getState = findViewById(R.id.ti_getState);
        //til_getEmail = findViewById(R.id.ti_getEmail);
        //til_getDesc = findViewById(R.id.ti_getDesc);
        //ti_getFName = findViewById(R.id.ti_getFName);
        //ti_getLName = findViewById(R.id.ti_getLName);
        //ti_getPhone = findViewById(R.id.ti_getPhone);
        //ti_getStreet = findViewById(R.id.ti_getStreet);
        //ti_getCity = findViewById(R.id.ti_getCity);
        //ti_getState = findViewById(R.id.ti_getState);
        //ti_getEmail = findViewById(R.id.ti_getEmail);
        //ti_getDesc = findViewById(R.id.ti_getDesc);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToContact = new Intent(v.getContext(), Contact.class);
                startActivity(goToContact);
            }
        });
        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToContact = new Intent(v.getContext(), Contact.class);
                startActivity(goToContact);
            }
        });
    }
}
