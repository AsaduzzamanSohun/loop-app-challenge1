package com.example.loopchallengeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton sumBtn, tableBtn, factorialBtn;
    LinearLayout myLayout;
    EditText editText;
    int sum = 0, table;
    float factorial = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumBtn = findViewById(R.id.sum_btn);
        tableBtn = findViewById(R.id.table_btn);
        factorialBtn = findViewById(R.id.factorial_btn);
        editText = findViewById(R.id.edit_text);
        myLayout = findViewById(R.id.my_layout);

        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fromEditText = editText.getText().toString();

                if (fromEditText.length() != 0){

                    int sumValue = Integer.parseInt(fromEditText);

                    myLayout.removeAllViews();
                    sum = 0;

                    TextView textView = new TextView(MainActivity.this);
                    textView.setTextSize(24);

                    for (int i = 0; i <= sumValue; i++){

                        sum = sum + i;

                    }

                    textView.append(""+sum);
                    myLayout.addView(textView);

                }else {

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Notice")
                            .setMessage("Please insert a value")
                            .show();
                }
            }
        });

        tableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fromEditText = editText.getText().toString();

                if (fromEditText.length() != 0){

                    table = Integer.parseInt(fromEditText);
                    myLayout.removeAllViews();

                    for (int i = 1; i <= 10; i++){

                        TextView textView = new TextView(MainActivity.this);
                        textView.setTextSize(24);

                        int result = table*i;

                        textView.append(table + " x " + i + " = " + result);
                        myLayout.addView(textView);

                    }

                }else {

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Notice")
                            .setMessage("Please insert a value")
                            .show();
                }
            }
        });

        factorialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fromEditText = editText.getText().toString();
                factorial = 1;
                if(fromEditText.length() != 0){

                    float factorialValue = Float.parseFloat(fromEditText);

                    myLayout.removeAllViews();

                    TextView textView = new TextView(MainActivity.this);
                    textView.setTextSize(24);

                    for (float i = 1; i <= factorialValue; i++){

                        factorial = factorial * i;

                    }
                    textView.append(""+factorial);
                    myLayout.addView(textView);
                }

                else {

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Notice")
                            .setMessage("Please insert a value")
                            .show();
                }
            }
        });
    }
}