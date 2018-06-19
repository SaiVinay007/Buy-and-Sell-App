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
    TextView tv12,tv2,tv7,tv10,tv8,tv11 ;
    Button b11,b12,b7,b8;
    Button b9,b10,b13,b14,b15;
    TextView tv22,tv21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent4 =getIntent();

        int item1 = intent4.getIntExtra("item1",-1);
        tv2 =  (TextView)findViewById(R.id.textView2);
        tv2.setText(Integer.toString(item1));
        int item2 = intent4.getIntExtra("item2",-1);
        tv12 = (TextView) findViewById(R.id.textView12);
        tv12.setText(Integer.toString(item2));



        int tag = intent4.getIntExtra("tag",-1);
        if(tag==1){

            b7 = (Button) findViewById(R.id.button7);
            b7.setVisibility(View.INVISIBLE);
            b8 = (Button) findViewById(R.id.button8);
            b8.setVisibility(View.INVISIBLE);
            b11 = (Button) findViewById(R.id.button11);
            b11.setVisibility(View.INVISIBLE);
            b12 = (Button) findViewById(R.id.button12);
            b12.setVisibility(View.INVISIBLE);

        }

        Intent intent6 = getIntent();
        int tag1 = intent6.getIntExtra("tag1",-1);
        if(tag1==0){
            b9 = (Button) findViewById(R.id.button9);
            b9.setVisibility(View.INVISIBLE);
            b10 = (Button) findViewById(R.id.button10);
            b10.setVisibility(View.INVISIBLE);
            b13 = (Button) findViewById(R.id.button13);
            b13.setVisibility(View.INVISIBLE);
            b14 = (Button) findViewById(R.id.button14);
            b14.setVisibility(View.INVISIBLE);
            b15 = (Button) findViewById(R.id.button15);
            b15.setVisibility(View.INVISIBLE);
            tv8 = (TextView) findViewById(R.id.textView8);
            tv8.setVisibility(View.INVISIBLE);
            tv11 = (TextView) findViewById(R.id.textView11);
            tv11.setVisibility(View.INVISIBLE);
            tv21 = (TextView) findViewById(R.id.textView21);
            tv21.setVisibility(View.INVISIBLE);
            tv22 = (TextView) findViewById(R.id.textView22);
            tv22.setVisibility(View.INVISIBLE);

        }


        Button mycart = (Button) findViewById(R.id.button15);
        mycart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv8 = (TextView) findViewById(R.id.textView8);
                tv11 = (TextView) findViewById(R.id.textView11);
                tv7 = (TextView) findViewById(R.id.textView7);
                tv10 = (TextView) findViewById(R.id.textView10);

                Intent intent5 = new Intent(Main2Activity.this,Main5Activity.class);
                intent5.putExtra("item1",tv7.getText().toString());
                intent5.putExtra("item2",tv10.getText().toString());
                intent5.putExtra("q1",tv8.getText().toString());
                intent5.putExtra("q2",tv11.getText().toString());

                startActivity(intent5);


            }
        });







    }

    public void add(View view){
        tv2 = (TextView) findViewById(R.id.textView2);
        String str1 =tv2.getText().toString();
        int a = Integer.parseInt(str1);

        TextView tv8 = (TextView) findViewById(R.id.textView8);
        number = Integer.parseInt(tv8.getText().toString());




        if(a>0){
            number+=1;
            tv2.setText(Integer.toString(a-1));
        }
        else{
            tv2.setText(Integer.toString(a));
        }
        tv8.setText(Integer.toString(number));



    }
    public void substract(View view) {
        tv2 = (TextView) findViewById(R.id.textView2);
        String str1 =tv2.getText().toString();
        int a = Integer.parseInt(str1);


        TextView tv8 = (TextView) findViewById(R.id.textView8);
        number = Integer.parseInt(tv8.getText().toString());
        if(number>0) {
            tv2.setText(Integer.toString(a + 1));
        }else{
            tv2.setText(Integer.toString(a));
        }
        if (number == 0) {
            number = 0;
        } else {
            number -= 1;
        }
        tv8.setText(Integer.toString(number));




    }

    public void add1(View view){
        tv12= (TextView) findViewById(R.id.textView12);
        String str2 =tv12.getText().toString();
        int b = Integer.parseInt(str2);

        TextView tv11 = (TextView) findViewById(R.id.textView11);

        if(b>0){
            number1+=1;
            tv12.setText(Integer.toString(b-1));
        }
        else{
            tv12.setText(Integer.toString(b));
        }
        tv11.setText(Integer.toString(number1));

    }
    public void substract1(View view) {
        tv12= (TextView) findViewById(R.id.textView12);
        String str2 =tv12.getText().toString();
        int b = Integer.parseInt(str2);

        TextView tv11 = (TextView) findViewById(R.id.textView11);
        number1 = Integer.parseInt(tv11.getText().toString());
        if(number1>0) {
            tv12.setText(Integer.toString(b + 1));
        }else{
            tv12.setText(Integer.toString(b));
        }
        if (number1 == 0) {
            number1 = 0;
        } else {
            number1 -= 1;
        }
        tv11.setText(Integer.toString(number1));


    }

    public void admin_add1(View view){
        tv2 = (TextView) findViewById(R.id.textView2);
        String str1 =tv2.getText().toString();
        int a = Integer.parseInt(str1);

        tv2.setText(Integer.toString(a + 1));

    }
    public void admin_substract1(View view){
        tv2 = (TextView) findViewById(R.id.textView2);
        String str1 =tv2.getText().toString();
        int a = Integer.parseInt(str1);
        if(a>0){
            tv2.setText(Integer.toString(a - 1));

        }else{
            tv2.setText(Integer.toString(a));

        }

    }
    public void admin_add2(View view){
        tv12 = (TextView) findViewById(R.id.textView12);
        String str1 =tv12.getText().toString();
        int a = Integer.parseInt(str1);

        tv12.setText(Integer.toString(a + 1));

    }
    public void admin_substract2(View view){
        tv12 = (TextView) findViewById(R.id.textView12);
        String str1 =tv12.getText().toString();
        int a = Integer.parseInt(str1);
        if(a>0){
            tv12.setText(Integer.toString(a - 1));

        }else{
            tv12.setText(Integer.toString(a));

        }

    }
}
