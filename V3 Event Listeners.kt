MainActivity.kt 

 

package com.lecture3 
 
import androidx.appcompat.app.AppCompatActivity 
import android.os.Bundle 
import android.widget.Button 
import android.widget.TextView 
import android.widget.Toast 
 
class MainActivity : AppCompatActivity() { 
override fun onCreate(savedInstanceState: Bundle?) { 
super.onCreate(savedInstanceState) 
setContentView(R.layout.activity_main) 
 
val but = findViewById<Button>(R.id.mybutton) 
val message = findViewById<TextView>(R.id.text1) 
 
but.setOnClickListener { 
 
Toast.makeText(this,"Hii,This is Harsh Agarwal How can I help you." ,Toast.LENGTH_LONG).show() 
message.text="Text is now changed" 
 
} 
 
 
} 
Activity_main.xml 

<?xml version="1.0" encoding="utf-8"?> 
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android" 
xmlns:app="http://schemas.android.com/apk/res-auto" 
xmlns:tools="http://schemas.android.com/tools" 
android:layout_width="match_parent" 
android:layout_height="match_parent" 
tools:context=".MainActivity"> 
 
<TextView 
android:id="@+id/text1" 
android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:text="Harsh Agarwal" 
app:layout_constraintBottom_toBottomOf="parent" 
app:layout_constraintLeft_toLeftOf="parent" 
app:layout_constraintRight_toRightOf="parent" 
app:layout_constraintTop_toTopOf="parent" /> 
 
<Button 
android:id="@+id/mybutton" 
android:layout_width="171dp" 
android:layout_height="148dp" 
android:text="Button" 
app:layout_constraintBottom_toBottomOf="parent" 
app:layout_constraintEnd_toEndOf="parent" 
app:layout_constraintHorizontal_bias="0.498" 
app:layout_constraintStart_toStartOf="parent" 
app:layout_constraintTop_toTopOf="parent" 
app:layout_constraintVertical_bias="0.224" /> 
 
</androidx.constraintlayout.widget.ConstraintLayout> 
