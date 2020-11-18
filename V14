Activity_main.xml 

<?xml version="1.0" encoding="utf-8"?> 
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    tools:context=".MainActivity"> 
    <ImageView 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:id="@+id/image" 
        android:src="@drawable/ic_launcher_background"/> 
    <LinearLayout 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:id="@+id/btn_layout" 
        android:layout_alignParentBottom="true" 
        android:orientation="vertical"> 
     <LinearLayout 
         android:layout_width="wrap_content" 
         android:layout_height="wrap_content" 
         android:orientation="horizontal" 
         android:weightSum="2" 
         <Button 
             android:width="0dp" 
             android:layout_width="0dp" 
             android:layout_height="match_parent" 
             android:id="@+id/fade_in" 
             android:text="Fade In" 
             android:textAllCaps="false" 
             android:layout_weight="1"/> 
          <Button 
              android:width="0dp" 
              android:layout_width="0dp" 
              android:layout_height="match_parent" 
              android:id="@+id/fade_out" 
              android:text="Fade Out" 
              android:textAllCaps="false" 
              android:layout_weight="1"/> 
    </LinearLayout> 
    
 
   <LinearLayout 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:orientation="horizontal" 
        android:weightSum="2" 
        <Button 
           android:width="0dp" 
           android:layout_width="0dp" 
           android:layout_height="match_parent" 
           android:id="@+id/Zoom_in" 
            android:text="Zoom In" 
            android:textAllCaps="false" 
            android:layout_weight="1"/> 
        <Button 
            android:width="0dp" 
            android:layout_width="0dp" 
            android:layout_height="match_parent" 
            android:id="@+id/zoom_out" 
            android:text="Zoom Out" 
            android:textAllCaps="false" 
            android:layout_weight="1"/> 
    </LinearLayout> 
<LinearLayout 
android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:orientation="horizontal" 
android:weightSum="2" 
<Button 
android:width="0dp" 
android:layout_width="0dp" 
android:layout_height="match_parent" 
android:id="@+id/slide_in" 
android:text="Slide In" 
android:textAllCaps="false" 
android:layout_weight="1"/> 
<Button 
android:width="0dp" 
android:layout_width="0dp" 
android:layout_height="match_parent" 
android:id="@+id/Slide_out" 
android:text="Slide Out" 
android:textAllCaps="false" 
android:layout_weight="1"/> 
    </LinearLayout> 
 
<LinearLayout 
android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:orientation="horizontal" 
android:weightSum="2" 
<Button 
android:width="0dp" 
android:layout_width="0dp" 
android:layout_height="match_parent" 
android:id="@+id/bounce" 
android:text="Bounce" 
android:textAllCaps="false" 
android:layout_weight="1"/> 
<Button 
android:width="0dp" 
android:layout_width="0dp" 
android:layout_height="match_parent" 
android:id="@+id/rotate" 
android:text="Rotate" 
android:textAllCaps="false" 
android:layout_weight="1"/> 
    </LinearLayout> 
    </LinearLayout> 
</RelativeLayout> 

Mainactivity.kt 

package com.e.video12 
 
import android.os.Bundle 
import android.os.Handler 
import com.google.android.material.floatingactionbutton.FloatingActionButton 
import com.google.android.material.snackbar.Snackbar 
import androidx.appcompat.app.AppCompatActivity 
import android.view.Menu 
import android.view.MenuItem 
import android.view.animation.Animation 
import android.view.animation.AnimationUtils 
import kotlinx.android.synthetic.main.activity_main.* 
 
class MainActivity : AppCompatActivity() { 
 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
        fade_in.setOnClickListener { 
            image.visibility=view.VISIBLE 
            val animation:AnimationUtils.loadAnimation(this,R.anim.fade_in) 
            image.startAnimation(animation) 
        } 
        fade_out.setOnClickListener { 
 
            val animation:AnimationUtils.loadAnimation(this,R.anim.fade_out) 
            image.startAnimation(animation) 
            Handler().postDelayed({image.visibility=view.GONE},1000) 
        } 
        zoom_in.setOnClickListener { 
 
            val animation:AnimationUtils.loadAnimation(this,R.anim.zoom_in) 
            image.startAnimation(animation) 
        } 
        zoom_out.setOnClickListener { 
 
            val animation:AnimationUtils.loadAnimation(this,R.anim.zoom_out) 
            image.startAnimation(animation) 
        } 
        slide_in.setOnClickListener { 
 
            val animation:AnimationUtils.loadAnimation(this,R.anim.slide_in) 
            image.startAnimation(animation) 
        } 
        slide_out.setOnClickListener { 
 
            val animation:AnimationUtils.loadAnimation(this,R.anim.slide_out) 
            image.startAnimation(animation) 
        } 
        bounce.setOnClickListener { 
 
            val animation:AnimationUtils.loadAnimation(this,R.anim.bounce) 
            image.startAnimation(animation) 
        } 
        rotate.setOnClickListener { 
 
            val animation:AnimationUtils.loadAnimation(this,R.anim.rotate) 
            image.startAnimation(animation) 
        } 
 
    } 
} 
