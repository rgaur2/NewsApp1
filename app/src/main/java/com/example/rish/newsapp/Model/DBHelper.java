package com.example.rish.newsapp.Model;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



public class DBHelper extends  SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "news_data.db";
    private static final String TAG = "dbhelper";

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public void onCreate(SQLiteDatabase db) {
        String queryString = "CREATE TABLE " + Contract.TABLE_TODO.TABLE_NAME + " ("+
                Contract.TABLE_TODO._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                Contract.TABLE_TODO.COLUMN_NAME_AUTHER+ " TEXT NOT NULL,"+
                Contract.TABLE_TODO.COLUMN_NAME_TITLE+ " TEXT NOT NULL,"+
                Contract.TABLE_TODO.COLUMN_NAME_DESC+ " TEXT NOT NULL,"+
                Contract.TABLE_TODO.COLUMN_NAME_URL+ " TEXT NOT NULL,"+
                Contract.TABLE_TODO.COLUMN_NAME_IMAGE+ " TEXT NOT NULL,"+
                Contract.TABLE_TODO.COLUMN_NAME_DATE + " DATE " + "); ";

        Log.d(TAG, "Create table SQL: " + queryString);
        db.execSQL(queryString);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("drop table " + Contract.TABLE_TODO.TABLE_NAME + " if exists;");
    }
}
