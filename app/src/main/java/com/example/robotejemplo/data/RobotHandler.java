package com.example.robotejemplo.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class RobotHandler extends SQLiteOpenHelper {
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "robotblue";

    private static final String DB_TABLE_ROBOT = "tobot";
    private static final String C_RT_ID = "id";
    private static final String C_RT_NAME = "name";
    private static final String C_RT_DESC = "description";
    private static final String C_RT_GROUP = "rgroup";
    private static final String C_RT_PART = "participation";
    private static final String C_RT_FUNC = "functions";

    private static final String DB_TABLE_STUDENT = "student";
    private static final String C_ST_ID = "id";



    public RobotHandler( Context context) {
        super(context, DB_NAME, null, DB_VERSION);



    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableGame = "CREATE TABLE " + DB_TABLE_ROBOT + "(" +
                C_RT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                C_RT_NAME + " TEXT," +
                C_RT_DESC + " TEXT, " +
                C_RT_GROUP + " TEXT," +
                C_RT_PART + " INTEGER," +
                C_RT_FUNC + " INTEGER)";
        db. execSQL(createTableGame) ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE_ROBOT);

        onCreate(db);
    }

    public long insertRobot (Robot robot) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put (C_RT_NAME, robot. getName());
        values.put(C_RT_DESC, robot.getDescripcion());
        values.put(C_RT_GROUP, robot.getGroup());
        values.put(C_RT_PART, robot.getParticipation());
        values.put(C_RT_FUNC, robot.getFunctions());


        long newId = db.insert(DB_TABLE_ROBOT, null, values) ;
        db.close();

        return newId;
    }




}
