package com.ce17b019.inventoryapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DataManager extends SQLiteOpenHelper   {

    private SQLiteDatabase db;

    public static final String TABLE_COLUMN_ID = "_id";
    public static final String TABLE_COLUMN_NAME = "item";
    public static final String TABLE_COLUMN_QUANTITY = "quantity";
    private static final String DB_NAME = "address_book_db";
    private static final int DB_VERSION = 1;
    private static final String TABLE_N_AND_A = "names_and_addresses";

    public DataManager(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String newTableQueryString = "create table "
                + TABLE_N_AND_A + " ("
                + TABLE_COLUMN_ID
                + " integer primary key autoincrement not null,"
                + TABLE_COLUMN_NAME
                + " text not null,"
                + TABLE_COLUMN_QUANTITY
                + " text not null);";
        db.execSQL(newTableQueryString);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



//    public DataManager(Context context) {
//
//        CustomSQLiteOpenHelper helper = new CustomSQLiteOpenHelper(context);
//
//        db = helper.getWritableDatabase();
//    }

    public void insert(String name, int quantity) {

        String query = "INSERT INTO " + TABLE_N_AND_A + " (" +
                TABLE_COLUMN_NAME + ", " +
                TABLE_COLUMN_QUANTITY + ") " +
                "VALUES (" +
                "'" + name + "'" + ", " +
                "'" + quantity + "'" +
                ");";
        Log.i("insert() = ", query);
        db.execSQL(query);
    }


//    public void delete(String name) {
//        String query = "DELETE FROM " + TABLE_N_AND_A +
//                " WHERE " + TABLE_ROW_NAME +
//                " = '" + name + "';";
//        Log.i("delete() = ", query);
//        db.execSQL(query);
//    }
//
    public Cursor selectAll() {
        Cursor c = db.rawQuery("SELECT *" + " from " +
                TABLE_N_AND_A, null);
        return c;
    }

    public Cursor searchName(String name) {

        String query = "SELECT " +
                TABLE_COLUMN_ID + ", " +
                TABLE_COLUMN_NAME +
                ", " + TABLE_COLUMN_QUANTITY +
                " from " +
                TABLE_N_AND_A + " WHERE " +
                TABLE_COLUMN_NAME + " = '" + name + "';";
        Log.i("searchName() = ", query);
        Cursor c = db.rawQuery(query, null);
        return c;

    }

    public void updateItem(long currentItemId, int quantity) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put( DataManager.TABLE_COLUMN_QUANTITY, quantity);
        String selection = DataManager.TABLE_COLUMN_ID + "=?";
        String[] selectionArgs = new String[] { String.valueOf(currentItemId) };
        db.update(DataManager.TABLE_COLUMN_NAME,
                values, selection, selectionArgs);
    }




//
//    private class CustomSQLiteOpenHelper extends SQLiteOpenHelper {
//
//        public CustomSQLiteOpenHelper(Context context) {
//            super(context, DB_NAME, null, DB_VERSION);
//        }
//
//        @Override
//        public void onCreate(SQLiteDatabase db) {
//            String newTableQueryString = "create table "
//                    + TABLE_N_AND_A + " ("
//                    + TABLE_ROW_ID
//                    + " integer primary key autoincrement not null,"
//                    + TABLE_ROW_NAME
//                    + " text not null,"
//                    + TABLE_ROW_AGE
//                    + " text not null);";
//            db.execSQL(newTableQueryString);
//        }
//
//        @Override
//        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//        }
//    }


}


