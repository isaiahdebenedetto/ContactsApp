package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class removeContact extends AppCompatActivity {

    Button btn_yes, btn_no;
    TextView tv_removeQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_contact);

        btn_no = findViewById(R.id.btn_no);
        btn_yes = findViewById(R.id.btn_yes);
        tv_removeQuestion = findViewById(R.id.tv_removeQuestion);

        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToContact = new Intent(v.getContext(), Contact.class);
                startActivity(goToContact);
            }
        });

        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMainActivity = new Intent(v.getContext(), MainActivity.class);
                startActivity(goToMainActivity);
            }
        });
    }
}
