package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //take values to string variable
    String val1;
    String val2;
    double answer;

    //create objects to set values
    EditText num1;
    EditText num2;
    TextView ans;

    Button add;
    Button subs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //set objects references
        num1 = findViewById(R.id.idans1);
        num2 = findViewById(R.id.idans2);
        add = findViewById(R.id.btnadd);
        ans = findViewById(R.id.idAns);
        subs = findViewById(R.id.btnsubs);

        Intent recive = getIntent();

        //get values to variable
        val1 = recive.getStringExtra("num1");
        val2 = recive.getStringExtra("num2");

        //set values to the objects
        num1.setText(val1);
        num2.setText(val2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer = Double.parseDouble(val1) + Double.parseDouble(val2);

                ans.setText(Double.toString(answer));

            }
        });

        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(val1) - Double.parseDouble(val2);

                ans.setText(Double.toString(answer));
            }
        });

    }
}
