Activity_main.xml 

<?xml version="1.0" encoding="utf-8"?> 
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    tools:context=".MainActivity"> 
    <LinearLayout 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:orientation="vertical"> 
        <EditText 
            android:layout_width="match_parent" 
            android:layout_height="wrap_content" 
            android:id="@+id/id" 
            android:hint="Enter the Id" 
            android:layout_weight="1"/> 
        <EditText 
            android:layout_width="match_parent" 
            android:layout_height="wrap_content" 
            android:id="@+id/name" 
            android:hint="Enter the name" 
            android:layout_weight="1"/> 
    </LinearLayout> 
    <LinearLayout 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:orientation="horizontal" 
        <Button 
            android:layout_width="match_parent" 
            android:layout_height="wrap_content" 
            android:id="@+id/Insert" 
            android:text="Insert"/> 
    <Button 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:id="@+id/View" 
        android:text="View"/> 
    <Button 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:id="@+id/Update" 
        android:text="Update"/> 
    <Button 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:id="@+id/Delete" 
        android:text="Delete"/> 
</LinearLayout> 
 
 
 
</LinearLayout> 

User.kt 

package com.video15 
 
class user{ 
    var id:Int = 0 
    var name:String="" 
    constructor(id:Int,name:String){ 
        this.id=id 
        this.name=name 
    } 
} 

Handler.kt 

package com.video15 
 
import android.content.ContentValues 
import android.content.Context 
import android.database.sqlite.SQLiteDatabase 
import android.database.sqlite.SQLiteOpenHelper 
import android.widget.Toast 
 
val db_name ="my_db" 
class handler(var context: Context):SQLiteOpenHelper(context, db_name,null,1) 
{ 
    override fun onCreate(p0: SQLiteDatabase?) { 
        val query ="create table User(id INTEGER(10) PRIMRY KEY, name VARCHAR(256))" 
        db?.execSQL(query) 
 
    } 
 
    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) { 
        TODO("Not yet implemented") 
    } 
    fun insert(user: user){ 
        val db:SQLiteDatabase =this.writableDatabase 
        var cv =ContentValues() 
        cv.put("id",user.id) 
        cv.put("name",user.name) 
        val result:Long=db.insert("user",null,cv) 
        if (result==-1.toLong()){ 
            Toast.makeText(context,"insertion failed",Toast.LENGTH_SHORT).show() 
        } 
 
    } 
 
 
} 

MainActivity.kt 

All in the photoes 

 
