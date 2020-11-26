MainActivity.kt 

package com.e.v12_1 
 
import android.content.Context 
import android.hardware.Sensor 
import android.hardware.SensorManager 
import android.os.Bundle 
import com.google.android.material.floatingactionbutton.FloatingActionButton 
import com.google.android.material.snackbar.Snackbar 
import androidx.appcompat.app.AppCompatActivity 
import android.view.Menu 
import android.view.MenuItem 
import android.widget.Adapter 
import android.widget.ArrayAdapter 
import kotlinx.android.synthetic.main.activity_main.* 
 
class MainActivity : AppCompatActivity() { 
 
override fun onCreate(savedInstanceState: Bundle?) { 
super.onCreate(savedInstanceState) 
setContentView(R.layout.activity_main) 
var sm:SensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager 
var list = sm.getSensorList(Sensor.TYPE_ALL) 
var adapter = ArrayAdapter<Sensor>(applicationContext,android.R.layout.simple_dropdown_item_1line,list) 
view.adapter=adapter 
 
 
} 
 
 
} 
Activity_main.xml 

<?xml version="1.0" encoding="utf-8"?> 
<androidx.coordinatorlayout.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android" 
xmlns:app="http://schemas.android.com/apk/res-auto" 
xmlns:tools="http://schemas.android.com/tools" 
android:layout_width="match_parent" 
android:layout_height="match_parent" 
tools:context=".MainActivity"> 
 
<ListView 
android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:id="@+id/view" 
</androidx.coordinatorlayout.widget.CoordinatorLayout> 
