package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact extends AppCompatActivity {

    Button btn_edit, btn_remove;
    TextView tv_fName, tv_lName, tv_phoneNumber, tv_street, tv_city, tv_state, tv_email, tv_desc;
    ImageView iv_contactPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        btn_edit = findViewById(R.id.btn_edit);
        btn_remove = findViewById(R.id.btn_remove);
        tv_fName = findViewById(R.id.tv_fName);
        tv_lName = findViewById(R.id.tv_lName);
        tv_phoneNumber = findViewById(R.id.tv_phoneNumber);
        tv_street = findViewById(R.id.tv_street);
        tv_city = findViewById(R.id.tv_city);
        tv_state = findViewById(R.id.tv_state);
        tv_email = findViewById(R.id.tv_email);
        tv_desc = findViewById(R.id.tv_desc);

        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToEdit = new Intent(v.getContext(), editContact.class);
                startActivity(goToEdit);
            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRemove = new Intent(v.getContext(), removeContact.class);
                startActivity(goToRemove);
            }
        });
    }
}
