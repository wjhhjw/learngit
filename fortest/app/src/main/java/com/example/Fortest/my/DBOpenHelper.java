package com.example.Fortest.my;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.Fortest.login.Register;
import com.example.Fortest.login.User;
import com.example.Fortest.login.login;

import java.util.ArrayList;

public class DBOpenHelper extends SQLiteOpenHelper {
    /**
     * 声明一个AndroidSDK自带的数据库变量db
     */
    private SQLiteDatabase db;

    /**
     * 写一个这个类的构造函数，参数为上下文context，所谓上下文就是这个类所在包的路径
     * 指明上下文，数据库名，工厂默认空值，版本号默认从1开始
     * super(context,"db_test",null,1);
     * 把数据库设置成可写入状态，除非内存已满，那时候会自动设置为只读模式
     * 不过，以现如今的内存容量，估计一辈子也见不到几次内存占满的状态
     * db = getReadableDatabase();
     */
    public DBOpenHelper(Context context){
        super(context,"db_test1",null,2);  //修改表的时候  一定要修改版本号！！！
        db = getReadableDatabase();
    }

    /**
     * 重写两个必须要重写的方法，因为class DBOpenHelper extends SQLiteOpenHelper
     * 而这两个方法是 abstract 类 SQLiteOpenHelper 中声明的 abstract 方法
     * 所以必须在子类 DBOpenHelper 中重写 abstract 方法
     * 想想也是，为啥规定这么死必须重写？
     * 因为，一个数据库表，首先是要被创建的，然后免不了是要进行增删改操作的
     * 所以就有onCreate()、onUpgrade()两个方法
     * @param db
     */
    //sex,birth,city,describe

    //                "u_id INTEGER,"+
    @Override
    public void onCreate(SQLiteDatabase db){  //建表语句
        db.execSQL("CREATE TABLE IF NOT EXISTS animal(" +
                "an_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "u_id INTEGER,"+
                "animalName TEXT," +
                "animalSex TEXT,"+
                "animalType TEXT,"+
                "animalBirth TEXT," +
                "animalDescribe TEXT)"
        );  //todo create_time  以及 update_time
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS animal");
        onCreate(db);
    }

    /**
     * 接下来写自定义的增删改查方法
     * 这些方法，写在这里归写在这里，以后不一定都用
     * add()
     * delete()
     * update()
     * getAllData()
     */

    public void add(Integer _id,String animalName, String animalSex, String animalType, String animalBirth, String animalDescribe){
        db.execSQL("INSERT INTO animal(u_id,animalName,animalSex,animalType,animalBirth,animalDescribe) VALUES(?,?,?,?,?,?)",new Object[]{_id,animalName,animalSex,animalType,animalBirth,animalDescribe});
    }
    //todo 修改参数  参照以上
//    public void delete(String animalName){
//        db.execSQL("DELETE FROM animal WHERE name = "+animalName);
//    }
//    public void updata(String animalName){
//        db.execSQL("UPDATE animal SET animalName = ?",new Object[]{animalName});
//    }

    /**
     * 前三个没啥说的，都是一套的看懂一个其他的都能懂了
     * 下面重点说一下查询表user全部内容的方法
     * 我们查询出来的内容，需要有个容器存放，以供使用，
     * 所以定义了一个ArrayList类的list
     * 有了容器，接下来就该从表中查询数据了，
     * 这里使用游标Cursor，这就是数据库的功底了，
     * 在Android中我就不细说了，因为我数据库功底也不是很厚，
     * 但我知道，如果需要用Cursor的话，第一个参数："表名"，中间5个：null，
     *                                                     最后是查询出来内容的排序方式："name DESC"
     * 游标定义好了，接下来写一个while循环，让游标从表头游到表尾
     * 在游的过程中把游出来的数据存放到list容器中
     * @return
     */
    //todo 需要加上——id??
    public ArrayList<Animal> getAllData(){

        ArrayList<Animal> list = new ArrayList<Animal>();
        //下面打开一个游标
        Cursor cursor = db.query("animal",null,null,null,null,null,"u_id DESC");
        while(cursor.moveToNext()){
            int forid=-1;

            if(Register._id!=null) forid=Register._id.intValue();
            else if(login._id!=null) forid=login._id.intValue();

            if(forid==cursor.getInt(cursor.getColumnIndex("u_id"))){
                String animalName=cursor.getString(cursor.getColumnIndex("animalName"));
                String animalSex= cursor.getString(cursor.getColumnIndex("animalSex"));
                String animalType= cursor.getString(cursor.getColumnIndex("animalType"));
                String animalBirth= cursor.getString(cursor.getColumnIndex("animalBirth"));
                String animalDescribe= cursor.getString(cursor.getColumnIndex("animalDescribe"));
                list.add(new Animal(animalName,animalSex,animalType,animalBirth,animalDescribe));
            }
            forid=-1;
        }

        cursor.close();  //游标用完必须关闭
        return list;
    }
}
