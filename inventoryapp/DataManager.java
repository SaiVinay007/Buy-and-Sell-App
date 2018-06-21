package com.ce17b019.inventoryapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DataManager extends SQLiteOpenHelper   {


    public DataManager(Context context) {
        super(context, "item.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table item(_id integer primary key autoincrement,name text not null ,quantity text not null)");
        db.execSQL("create table login(_id integer primary key autoincrement,firstname text not null,username text not null ,email text not null ,password text not null,conformpassword text not null )");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("drop  table if exists item");
//        onCreate(db);
    }
}


