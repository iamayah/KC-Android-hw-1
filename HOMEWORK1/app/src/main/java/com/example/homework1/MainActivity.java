package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cc = findViewById(R.id.calc);
        EditText quiz = findViewById(R.id.quiz);
        EditText hw = findViewById(R.id.hw);
        EditText mt = findViewById(R.id.mt);
        EditText ff = findViewById(R.id.ff);
        Button clc = findViewById(R.id.btn);
        TextView rslt = findViewById(R.id.rslt);
        Button rstbtn = findViewById(R.id.rstbtn);



        clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(quiz.getText().toString());
                int num2 = Integer.parseInt(hw.getText().toString());
                int num3 = Integer.parseInt(mt.getText().toString());
                int num4 = Integer.parseInt(ff.getText().toString());

                int result = num1 + num2 + num3 + num4;

                rslt.setText(String.valueOf(result));

            }
        });
        rstbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quiz.setText(null);
                quiz.dispatchDisplayHint(View.VISIBLE);

                hw.setText(null);
                hw.dispatchDisplayHint(View.VISIBLE);

                mt.setText(null);
                mt.dispatchDisplayHint(View.VISIBLE);

                ff.setText(null);
                ff.dispatchDisplayHint(View.VISIBLE);

                rslt.setText("result");
            }
        });
    }
}