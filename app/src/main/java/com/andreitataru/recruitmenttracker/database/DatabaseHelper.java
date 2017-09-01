package com.andreitataru.recruitmenttracker.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by andreitataru on 19/07/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "recritment.db";

    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String CREATE_PROJECT_TABLE = "CREATE TABLE " + DatabaseContracts.Project.TABLE_NAME
                + "(" + DatabaseContracts.Project._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + DatabaseContracts.Project.COLUMN_NAME_PROJECT + " TEXT NOT NULL,"
                + DatabaseContracts.Project.COLUMN_NAME_PROJECT_DESCRIPTION + " TEXT,"
                + DatabaseContracts.Project.COLUMN_NAME_START_DATE + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
                + DatabaseContracts.Project.COLUMN_NAME_DUE_DATE + " TIMESTAMP,"
                + DatabaseContracts.Project.COLUMN_NAME_END_DATE + " TIMESTAMP,"
                + DatabaseContracts.Project.COLUMN_NAME_AKTIV + " INTEGER"
                + ");";

        sqLiteDatabase.execSQL(CREATE_PROJECT_TABLE);

                ;

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DatabaseContracts.Project.TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
