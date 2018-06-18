package com.ce17b019.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    int number,number1;
    TextView tv1;
    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent4 =getIntent();



        int item1 = intent4.getIntExtra("item1",-1);
        tv1 =  (TextView)findViewById(R.id.textView2);
        tv1.setText(Integer.toString(item1));
        int item2 = intent4.getIntExtra("item2",-1);
        tv2 = (TextView) findViewById(R.id.textView12);
        tv2.setText(Integer.toString(item2));

    }

    public void add(View view){
        tv1 = (TextView) findViewById(R.id.textView2);
        String str1 =tv1.getText().toString();
        int a = Integer.parseInt(str1);

        TextView tv = (TextView) findViewById(R.id.textView8);
        number = Integer.parseInt(tv.getText().toString());
        number+=1;
        tv.setText(Integer.toString(number));
        tv1.setText(Integer.toString(a-1));



    }
    public void substract(View view) {
        tv1 = (TextView) findViewById(R.id.textView2);
        String str1 =tv1.getText().toString();
        int a = Integer.parseInt(str1);


        TextView tv = (TextView) findViewById(R.id.textView8);
        number = Integer.parseInt(tv.getText().toString());
        if(number>0) {
            tv1.setText(Integer.toString(a + 1));
        }else{
            tv1.setText(Integer.toString(a));
        }
        if (number == 0) {
            number = 0;
        } else {
            number -= 1;
        }
        tv.setText(Integer.toString(number));




    }

    public void add1(View view){
        tv2= (TextView) findViewById(R.id.textView12);
        String str2 =tv2.getText().toString();
        int b = Integer.parseInt(str2);

        TextView tv = (TextView) findViewById(R.id.textView11);
        number1 = Integer.parseInt(tv.getText().toString());
        number1 +=1;
        tv.setText(Integer.toString(number1));
        tv2.setText(Integer.toString(b-1));

    }
    public void substract1(View view) {
        tv2= (TextView) findViewById(R.id.textView12);
        String str2 =tv2.getText().toString();
        int b = Integer.parseInt(str2);

        TextView tv = (TextView) findViewById(R.id.textView11);
        number1 = Integer.parseInt(tv.getText().toString());
        if(number1>0) {
            tv2.setText(Integer.toString(b + 1));
        }else{
            tv2.setText(Integer.toString(b));
        }
        if (number1 == 0) {
            number1 = 0;
        } else {
            number1 -= 1;
        }
        tv.setText(Integer.toString(number1));


    }
}
