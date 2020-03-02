package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstApplication extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_application);

        num1 = findViewById(R.id.idNo01);
        num2 = findViewById(R.id.idNo02);
        btnOK = findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myintent = new Intent(FirstApplication.this,SecondActivity.class);
                myintent.putExtra("num1",num1.getText().toString());
                myintent.putExtra("num2",num2.getText().toString());

                startActivity(myintent);
            }
        });
    }
}
