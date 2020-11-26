MainActivity.kt 

package com.video8 
 
import androidx.appcompat.app.AppCompatActivity 
import android.os.Bundle 
import android.view.ContextMenu 
import android.view.MenuItem 
import android.view.View 
import android.widget.ArrayAdapter 
import android.widget.ListView 
import android.widget.Toast 
import kotlinx.android.synthetic.main.activity_main.* 
 
class MainActivity : AppCompatActivity() { 
    private var item= arrayOf("9999999999999","98888888889","988887667","80000000000002") 
    private var list:ListView?=null 
    private var arrayAdapter:ArrayAdapter<String>?=null 
 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
 
        list=findViewById(R.id.list) 
        arrayAdapter=ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,item) 
        list?.adapter=arrayAdapter 
        registerForContextMenu(list) 
    } 
 
    override fun onCreateContextMenu( 
        menu: ContextMenu?, 
        v: View?, 
        menuInfo: ContextMenu.ContextMenuInfo? 
    ) { 
        menuInflater.inflate(R.menu.main_menu,menu) 
    } 
 
    override fun onContextItemSelected(item: MenuItem): Boolean { 
        var display="" 
 
        when(item.itemId) 
        { 
            R.id.call->display="calling" 
            R.id.msg->display="sending" 
            R.id.edit->display="Editing" 
            R.id.delete->display="Deleting" 
 
        } 
        Toast.makeText( this,display, Toast.LENGTH_SHORT).show() 
 
        return super.onContextItemSelected(item) 
    } 
} 

 

 

Main_menu.xml 

<?xml version="1.0" encoding="utf-8"?> 
<menu xmlns:android="http://schemas.android.com/apk/res/android"> 
    <item 
    android:id="@+id/call" 
    android:title="Call"/> 
    <item 
        android:id="@+id/msg" 
        android:title="message"/> 
    <item 
        android:id="@+id/edit" 
        android:title="edit"/> 
    <item 
        android:id="@+id/delete" 
        android:title="delete"/> 
 
 
 
 
 
</menu> 

 

 

activity_main.xml 

<?xml version="1.0" encoding="utf-8"?> 
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    tools:context=".MainActivity"> 
 
    <TextView 
        android:id="@+id/txt_no" 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:text="9149242933" 
        app:layout_constraintBottom_toBottomOf="parent" 
        app:layout_constraintLeft_toLeftOf="parent" 
        app:layout_constraintRight_toRightOf="parent" 
        app:layout_constraintTop_toTopOf="parent" /> 
<ListView 
    android:layout_width="wrap_content" 
    android:layout_height="wrap_content" 
    android:id="@+id/list"/> 
</androidx.constraintlayout.widget.ConstraintLayout> 
