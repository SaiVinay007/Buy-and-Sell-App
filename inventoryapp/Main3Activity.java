package com.ce17b019.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    String str1;
    String str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);




        TextView tv1=(TextView) findViewById(R.id.textView);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent1);
            }
        });

        Button b1 =(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 = (EditText) findViewById(R.id.editText);
                EditText et2 = (EditText) findViewById(R.id.editText1);

                str1= et1.getText().toString();
                str2= et2.getText().toString();
                Intent intent3 = getIntent();
                String firstname = intent3.getStringExtra("firstname");
                String username = intent3.getStringExtra("username");
                String email = intent3.getStringExtra("email");
                String password = intent3.getStringExtra("password");
                String conformpassword = intent3.getStringExtra("conformpassword");
//                Log.d("un", username);
 //               Log.d("un",password);
                Log.d("un",str1);
                Log.d("un",str2);


                if(str1.equals(username) && str2.equals(password)){
                    Log.d("hi",  str1);
                    Intent intent2 = new Intent(Main3Activity.this,MainActivity.class);
                    startActivity(intent2);
                }


            }
        });
    }
}
