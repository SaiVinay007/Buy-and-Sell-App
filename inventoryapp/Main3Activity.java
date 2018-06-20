package com.ce17b019.inventoryapp;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    DataManager dm;

    String str1;
    String str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        dm = new DataManager(this);
        dm.insert("item1",10);
        dm.insert("item2",10);
        dm.insert("item3",10);
        dm.insert("item4",10);
        dm.insert("item5",10);
        dm.insert("item6",10);
        dm.insert("item7",10);
        dm.insert("item8",10);




        TextView tv1=(TextView) findViewById(R.id.textView);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent1);
            }
        });

        Button login =(Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
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
//                int tag = intent3.getIntExtra("tag",-1);



                if(str1.equals(username) && str2.equals(password)  ){

                    Intent intent2 = new Intent(Main3Activity.this,MainActivity.class);

                    startActivity(intent2);
                }
                else if(str1.equals("vendor1")&&str2.equals("1") ){
                    Intent intent6 = new Intent(Main3Activity.this,Main2Activity.class);
                    intent6.putExtra("item1" ,50);
                    intent6.putExtra("item2" ,45);
                    intent6.putExtra("tag1" ,0);
                    startActivity(intent6);

                }
                else if(str1.equals("vendor2")&&str2.equals("2")){
                    Intent intent6 = new Intent(Main3Activity.this,Main2Activity.class);
                    intent6.putExtra("item1" ,10);
                    intent6.putExtra("item2" ,25);
                    intent6.putExtra("tag1" ,0);
                    startActivity(intent6);
                }
                else if(str1.equals("vendor3")&&str2.equals("3")){
                    Intent intent6 = new Intent(Main3Activity.this,Main2Activity.class);
                    intent6.putExtra("item1" ,110);
                    intent6.putExtra("item2" ,65);
                    intent6.putExtra("tag1" ,0);
                    startActivity(intent6);
                }
                else if(str1.equals("vendor4")&&str2.equals("4")){
                    Intent intent6 = new Intent(Main3Activity.this,Main2Activity.class);
                    intent6.putExtra("item1" ,60);
                    intent6.putExtra("item2" ,35);
                    intent6.putExtra("tag1" ,0);
                    startActivity(intent6);
                }
                else if(str1.equals("vendor5")&&str2.equals("5")){
                    Intent intent6 = new Intent(Main3Activity.this,Main2Activity.class);
                    intent6.putExtra("item1" ,5);
                    intent6.putExtra("item2" ,4);
                    intent6.putExtra("tag1" ,0);
                    startActivity(intent6);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid username or password",Toast.LENGTH_LONG).show();
                }


            }
        });


    }

    public void showData(Cursor c){
        while (c.moveToNext()){
            Log.i(c.getString(1), c.getString(2));
        }
    }
}
