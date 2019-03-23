package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AddContact extends AppCompatActivity {

    Button btn_addContact, btn_cancel;
    ImageView iv_userPhoto;
    TextView tv_editPhoto;
    TextInputLayout til_getFName, til_getLName, til_getPhone, til_getStreet, til_getCity,
        til_getState, til_getEmail, til_getDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        btn_addContact = findViewById(R.id.btn_addContact);
        btn_cancel = findViewById(R.id.btn_cancel);
        iv_userPhoto = findViewById(R.id.iv_userPhoto);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHome = new Intent(v.getContext(), MainActivity.class);
                startActivity(goToHome);
            }
        });
   }
}
