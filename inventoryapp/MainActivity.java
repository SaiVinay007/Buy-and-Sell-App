package com.ce17b019.inventoryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1;
        Button b2;
        Button b3;
        Button b4;
        Button b5;

        b1 =(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent4 = new Intent(MainActivity.this ,Main2Activity.class);

                intent4.putExtra("item1" ,50);
                intent4.putExtra("item2" ,45);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        });

        b2 =(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent4 = new Intent(MainActivity.this ,Main2Activity.class);

                intent4.putExtra("item1" ,10);
                intent4.putExtra("item2" ,25);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        }); b3 =(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent4 = new Intent(MainActivity.this ,Main2Activity.class);

                intent4.putExtra("item1" ,110);
                intent4.putExtra("item2" ,65);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        }); b4 =(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent4 = new Intent(MainActivity.this ,Main2Activity.class);

                intent4.putExtra("item1" ,60);
                intent4.putExtra("item2" ,35);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        }); b5 =(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent4 = new Intent(MainActivity.this ,Main2Activity.class);

                intent4.putExtra("item1" ,5);
                intent4.putExtra("item2" ,4);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        });



    }


}
