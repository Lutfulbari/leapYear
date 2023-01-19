package com.lutful.class214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sNum = editText.getText().toString();
                if(sNum.length() >0) {

                    int year = Integer.parseInt(sNum);
                    if (year % 400 == 0) tvDisplay.setText(year + "Akta leap year !!");

                    else if (year%4== 0 && year %100!=0)tvDisplay.setText(year + "Akta leap year !!");
                    else tvDisplay.setText(year + "Akta leap year noy !!");
                } else{

                    editText.setError("thik moto number dao");

                }
            });

        }
    }