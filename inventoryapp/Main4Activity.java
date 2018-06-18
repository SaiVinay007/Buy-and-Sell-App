package com.ce17b019.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button b1 = (Button) findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText e1 =(EditText) findViewById(R.id.editText2);
                String firstname= e1.getText().toString();
                EditText e2 =(EditText) findViewById(R.id.editText3);
                String username= e2.getText().toString();
                EditText e3 =(EditText) findViewById(R.id.editText4);
                String email= e3.getText().toString();
                EditText e4 =(EditText) findViewById(R.id.editText5);
                String password= e4.getText().toString();
                EditText e5 =(EditText) findViewById(R.id.editText6);
                String conformpassword= e5.getText().toString();

                Intent intent5 = new Intent(Main4Activity.this,Main3Activity.class);
                intent5.putExtra("firstname",firstname);
                intent5.putExtra("lastname",username);
                intent5.putExtra("email",email);
                intent5.putExtra("password",password);
                intent5.putExtra("phone",conformpassword);
                startActivity(intent5);



            }
        });
    }

}
