package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count;
    String Name;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    TextView txt1;
    TextView txt2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(TextView)this.findViewById(R.id.textView);
        txt2=(TextView)this.findViewById(R.id.textView2);
        btn1=(Button)this.findViewById(R.id.button);
        btn2=(Button)this.findViewById(R.id.button3);
        btn3=(Button)this.findViewById(R.id.button2);
        btn4=(Button)this.findViewById(R.id.button4);
        btn5=(Button)this.findViewById(R.id.button5);
        btn6=(Button)this.findViewById(R.id.button6);
        btn7=(Button)this.findViewById(R.id.button7);
        Toast.makeText(this,Name,Toast.LENGTH_SHORT).show();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=1;
                txt1.setText("SAY ALLHAMDLILLAH");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("SAY ALLAH-O-AKBAR");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("SAY ASTAGHFAR");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("RECITE DAROOD");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("RECITE-AYATE-E-KAREMA");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                txt1.setText("SELECT TASBEEH");
                txt2.setText(""+count);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText(""+count);
                count++;
                if(count==34)
                {
                    count=0;

                }
                if(count==0)
                {
                    {
                        txt1.setText("SELECT TASBEEH");
                    }
                }


            }
        });


    }
}