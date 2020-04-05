 package com.example.simplecalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Value1, Value2;
    private Button Add, Sub, Mul, Div;
    private TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Value1 = (EditText) findViewById(R.id.et1);
        Value2 = (EditText) findViewById(R.id.et2);
        Add = (Button) findViewById(R.id.addbtn);
        Sub = (Button) findViewById(R.id.subbtn);
        Mul = (Button) findViewById(R.id.mulbtn);
        Div = (Button) findViewById(R.id.divbtn);
        Answer = (TextView) findViewById(R.id.tv1);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int A = Integer.parseInt(Value1.getText().toString());
                int B = Integer.parseInt(Value2.getText().toString());
                int Result = A + B;
                Answer.setText("Answer:" + Result);
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt(Value1.getText().toString());
                int B = Integer.parseInt(Value2.getText().toString());
                int Result = A - B;
                Answer.setText("Answer:" + Result);
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt(Value1.getText().toString());
                int B = Integer.parseInt(Value2.getText().toString());
                int Result = A * B;
                Answer.setText("Answer:" + Result);
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float A = Float.parseFloat(Value1.getText().toString());
                float B = Float.parseFloat(Value2.getText().toString());
                float Result = A / B;
                Answer.setText("Answer:" + Result);
            }
        });
    }
}


