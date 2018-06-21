package com.ce17b019.inventoryapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dm = new DataManager(this);
        SQLiteDatabase db1 = dm.getWritableDatabase();

        ContentValues values1 = new ContentValues();
        values1.put("name","item1");
        values1.put("quantity",50);
        db1.insert("item",null,values1);
        ContentValues values2 = new ContentValues();
        values2.put("name","item1");
        values2.put("quantity",45);
        db1.insert("item",null,values2);
        ContentValues values3 = new ContentValues();
        values3.put("name","item1");
        values3.put("quantity",10);
        db1.insert("item",null,values3);
        ContentValues values4 = new ContentValues();
        values4.put("name","item1");
        values4.put("quantity",25);
        db1.insert("item",null,values4);
        ContentValues values5 = new ContentValues();
        values5.put("name","item1");
        values5.put("quantity",110);
        db1.insert("item",null,values5);
        ContentValues values6 = new ContentValues();
        values6.put("name","item1");
        values6.put("quantity",65);
        db1.insert("item",null,values6);
        ContentValues values7 = new ContentValues();
        values7.put("name","item1");
        values7.put("quantity",60);
        db1.insert("item",null,values7);
        ContentValues values8 = new ContentValues();
        values8.put("name","item1");
        values8.put("quantity",35);
        db1.insert("item",null,values8);
        ContentValues values9 = new ContentValues();
        values9.put("name","item1");
        values9.put("quantity",5);
        db1.insert("item",null,values9);
        ContentValues values10 = new ContentValues();
        values10.put("name","item1");
        values10.put("quantity",4);
        db1.insert("item",null,values10);








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

//                intent4.putExtra("item1" ,50);
//                intent4.putExtra("item2" ,45);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        });

        b2 =(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent4 = new Intent(MainActivity.this ,Main2Activity.class);

//                intent4.putExtra("item1" ,10);
//                intent4.putExtra("item2" ,25);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        }); b3 =(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent4 = new Intent(MainActivity.this ,Main2Activity.class);

//                intent4.putExtra("item1" ,110);
//                intent4.putExtra("item2" ,65);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        }); b4 =(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent4 = new Intent(MainActivity.this ,Main2Activity.class);

//                intent4.putExtra("item1" ,60);
//                intent4.putExtra("item2" ,35);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        }); b5 =(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent4 = new Intent(MainActivity.this ,Main2Activity.class);

//                intent4.putExtra("item1" ,5);
//                intent4.putExtra("item2" ,4);
                intent4.putExtra("tag",1);
                startActivity(intent4);



            }
        });



    }


}
