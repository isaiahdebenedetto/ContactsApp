package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView iv_search, iv_userIcon;
    Button btn_addContact, btn_contact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_search = findViewById(R.id.iv_search);
        iv_userIcon = findViewById(R.id.iv_userIcon);
        btn_addContact = findViewById(R.id.btn_addContact);
        btn_contact = findViewById(R.id.btn_contact);

        btn_addContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent goToAdd = new Intent(v.getContext(), AddContact.class);
                startActivity(goToAdd);
            }
        });

        iv_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSearch = new Intent(v.getContext(), Search.class);
                startActivity(goToSearch);
            }
        });

        btn_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToContact = new Intent(v.getContext(), Contact.class);
                startActivity(goToContact);
            }
        });
    }
}
