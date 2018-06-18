package com.ce17b019.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

         et1 = (EditText) findViewById(R.id.editText);
         et2 = (EditText) findViewById(R.id.editText1);

        TextView tv1=(TextView) findViewById(R.id.textView);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent3);
            }
        });

        Button b1 =(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = getIntent();
                String firstname = intent5.getStringExtra("firstname");
                String username = intent5.getStringExtra("username");
                String email = intent5.getStringExtra("email");
                String password = intent5.getStringExtra("password");
                String phone = intent5.getStringExtra("conformpassword");

                if(et1.equals(username) && et2.equals(password)){
                    Intent intent4 = new Intent(Main3Activity.this,MainActivity.class);
                    startActivity(intent4);
                }

            }
        });
    }
}
