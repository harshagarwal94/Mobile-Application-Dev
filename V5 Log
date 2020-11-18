MainActivity.kt 

 

package com.lec5log_toast_method 
 
import androidx.appcompat.app.AppCompatActivity 
import android.os.Bundle 
import android.util.Log 
import android.widget.Button 
import android.widget.Toast 
 
class MainActivity : AppCompatActivity() { 
override fun onCreate(savedInstanceState: Bundle?) { 
super.onCreate(savedInstanceState) 
setContentView(R.layout.activity_main) 
 
val a =findViewById<Button>(R.id.b1) 
val b =findViewById<Button>(R.id.b2) 
 
a.setOnClickListener { 
Log.i("text", "This message is for log message") 
 
} 
 
b.setOnClickListener { 
Toast.makeText(this, "This message is only for toast message",Toast.LENGTH_LONG).show() 
} 
 
 
 
} 
} 

 

 

activity_main.xml<?xml version="1.0" encoding="utf-8"?> 
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    tools:context=".MainActivity"> 
 
    <Button 
        android:id="@+id/b1" 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:text="Log button" 
        app:layout_constraintBottom_toBottomOf="parent" 
        app:layout_constraintEnd_toEndOf="parent" 
        app:layout_constraintHorizontal_bias="0.204" 
        app:layout_constraintStart_toStartOf="parent" 
        app:layout_constraintTop_toTopOf="parent" 
        app:layout_constraintVertical_bias="0.499" /> 
 
    <Button 
        android:id="@+id/b2" 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:text="toast" 
        app:layout_constraintBottom_toBottomOf="parent" 
        app:layout_constraintEnd_toEndOf="parent" 
        app:layout_constraintHorizontal_bias="0.817" 
        app:layout_constraintStart_toStartOf="parent" 
        app:layout_constraintTop_toTopOf="parent" 
        app:layout_constraintVertical_bias="0.499" /> 
 
</androidx.constraintlayout.widget.ConstraintLayout> 
