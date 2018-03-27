package com.example.hdrdr.contadortenis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1A;
    private Button btn2A;
    private Button btn3A;
    private Button btn1B;
    private Button btn2B;
    private Button btn3B;
    private Button btnRst;

    private TextView tv1;
    private TextView tv2;
    //private EditText et1;
    int counterA = 0;
    int counterB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1A = (Button) findViewById(R.id.TeamAButton1);
        btn2A = (Button) findViewById(R.id.TeamAButton2);
        btn3A = (Button) findViewById(R.id.TeamAButton3);
        tv1 = (TextView) findViewById(R.id.TextViewA);
        btn1B = (Button) findViewById(R.id.TeamBButton1);
        btn2B = (Button) findViewById(R.id.TeamBButton2);
        btn3B = (Button) findViewById(R.id.TeamBButton3);
        tv2 = (TextView) findViewById(R.id.TextViewB);
        btnRst = (Button) findViewById(R.id.ButtonReset);


        btn1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterA += 15;
                tv1.setText(Integer.toString(counterA));
            }
        });
        btn2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterA += 10;
                tv1.setText(Integer.toString(counterA));
            }
        });
        btn3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterA += 20;
                tv1.setText(Integer.toString(counterA));
            }
        });

        btn1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterB += 15;
                tv2.setText(Integer.toString(counterB));
            }
        });
        btn2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterB += 10;
                tv2.setText(Integer.toString(counterB));
            }
        });
        btn3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterB += 20;
                tv2.setText(Integer.toString(counterB));
            }
        });

        btnRst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("0");
                tv2.setText("0");
                counterA = 0;
                counterB = 0;
            }
        });

    }
}
