package com.example.athkar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AthkarDB extends SQLiteOpenHelper {
    public static final String DBName = "Login.db";

    public AthkarDB(@Nullable Context context) {
        super(context, DBName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table users(username Text primary key, password Text, name Text, country Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists users");
    }
    public boolean InsertNewUser(String email, String password, String name, String country)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", email);
        contentValues.put("password", password);
        contentValues.put("name", name);
        contentValues.put("country", country);
        long result = MyDB.insert("users",null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }
    public boolean CheckIfUserExist(String username)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from users where username = ?",
                new String[] {username});
        if(cursor.getCount() > 0)
            return true;
        else
            return false;
    }
    public boolean checkusernamepassword(String username, String password)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from users where username = ? and password = ?",
                new String[] {username, password});
        if(cursor.getCount() > 0)
            return  true;
        else
            return false;
    }
}
