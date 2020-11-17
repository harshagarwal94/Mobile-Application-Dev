Mainactivity.kt 

package com.lecture4assigninglistenerstomultipleviewelements 
 
import androidx.appcompat.app.AppCompatActivity 
import android.os.Bundle 
import android.widget.Button 
import android.widget.TextView 
 
class MainActivity : AppCompatActivity() { 
override fun onCreate(savedInstanceState: Bundle?) { 
super.onCreate(savedInstanceState) 
setContentView(R.layout.activity_main) 
 
val a = findViewById<Button>(R.id.b2) 
val b = findViewById<Button>(R.id.b3) 
val c = findViewById<Button>(R.id.b4) 
val d = findViewById<TextView>(R.id.textView) 
 
a.setOnClickListener { 
d.setTextSize(20f) 
} 
b.setOnClickListener { 
d.setTextSize(40f) 
} 
c.setOnClickListener { 
d.setTextSize(80f) 
} 
 
 
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
android:id="@+id/textView" 
android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:text="Here is some text" 
app:layout_constraintBottom_toBottomOf="parent" 
app:layout_constraintEnd_toEndOf="parent" 
app:layout_constraintHorizontal_bias="0.498" 
app:layout_constraintStart_toStartOf="parent" 
app:layout_constraintTop_toTopOf="parent" 
app:layout_constraintVertical_bias="0.266" /> 
 
<Button 
android:id="@+id/b2" 
android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:text="small" 
app:layout_constraintBottom_toBottomOf="parent" 
app:layout_constraintEnd_toEndOf="parent" 
app:layout_constraintHorizontal_bias="0.126" 
app:layout_constraintStart_toStartOf="parent" 
app:layout_constraintTop_toTopOf="parent" 
app:layout_constraintVertical_bias="0.426" /> 
 
<Button 
android:id="@+id/b3" 
android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:text="medium" 
app:layout_constraintBottom_toBottomOf="parent" 
app:layout_constraintEnd_toEndOf="parent" 
app:layout_constraintHorizontal_bias="0.544" 
app:layout_constraintStart_toStartOf="parent" 
app:layout_constraintTop_toTopOf="parent" 
app:layout_constraintVertical_bias="0.426" /> 
 
<Button 
android:id="@+id/b4" 
android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:text="large" 
app:layout_constraintBottom_toBottomOf="parent" 
app:layout_constraintEnd_toEndOf="parent" 
app:layout_constraintHorizontal_bias="0.922" 
app:layout_constraintStart_toStartOf="parent" 
app:layout_constraintTop_toTopOf="parent" 
app:layout_constraintVertical_bias="0.426" /> 
 
</androidx.constraintlayout.widget.ConstraintLayout> 
