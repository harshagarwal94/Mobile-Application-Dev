Activity_main.xml 

<?xml version="1.0" encoding="utf-8"?> 
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    android:orientation="vertical" 
    android:padding="10dp" 
    tools:context=".MainActivity"> 
 
    <fragment 
        android:id="@+id/fragment2" 
        android:name="com.video10.Activity2" 
        android:layout_width="match_parent" 
        android:layout_height="49dp" /> 
 
    <fragment 
        android:id="@+id/fragment" 
        android:name="com.video10.activity1" 
        android:layout_width="match_parent" 
        android:layout_height="89dp" /> 
 
    <EditText 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:hint="Enter the website URL" 
        android:id="@+id/txt_URL"/> 
    <Button 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:id="@+id/url_click" 
        android:onClick="open" 
        android:text="Search" 
        android:background="@android:color/holo_orange_dark" 
        android:textColor="@android:color/holo_blue_light"/> 
    <EditText 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:hint="Enter the Phone Number" 
        android:id="@+id/txt_phone"/> 
    <Button 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:id="@+id/ur_call" 
        android:onClick="Dial" 
        android:text="Dial" 
        android:background="@android:color/holo_orange_dark" 
        android:textColor="@android:color/holo_blue_light"/> 
    <EditText 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:hint="Enter Your Location" 
        android:id="@+id/txt_map"/> 
    <Button 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:id="@+id/url_map" 
        android:onClick="findloc" 
        android:text="Find your Location" 
        android:background="@android:color/holo_orange_dark" 
        android:textColor="@android:color/holo_blue_light"/> 
    <EditText 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:hint="Enter your message" 
        android:id="@+id/txt_msg"/> 
    <Button 
        android:layout_width="match_parent" 
        android:layout_height="wrap_content" 
        android:id="@+id/url_send" 
        android:text="Send the message" 
        android:onClick="Message" 
        android:background="@android:color/holo_orange_dark" 
        android:textColor="@android:color/holo_blue_light"/> 
 
</LinearLayout> 

MainActivity.kt 

package com.video10 
 
import android.content.Intent 
import android.net.Uri 
import androidx.appcompat.app.AppCompatActivity 
import android.os.Bundle 
import android.view.View 
import androidx.core.app.ShareCompat 
import kotlinx.android.synthetic.main.activity_main.* 
 
class MainActivity : AppCompatActivity() { 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
    } 
 
    fun open(view: View) { 
        var uri=Uri.parse(txt_URL.text.toString()) 
        startActivity(Intent(Intent.ACTION_VIEW,uri)) 
    } 
 
    fun Dial(view: View) { 
        var uri=Uri.parse(txt_phone.text.toString()) 
        startActivity(Intent(Intent.ACTION_DIAL,uri)) 
    } 
 
    fun findloc(view: View) { 
        var uri=Uri.parse(url_map.text.toString()) 
        startActivity(Intent(Intent.ACTION_VIEW,uri)) 
    } 
 
    fun Message(view: View) { 
        ShareCompat.IntentBuilder.from(this) 
            .setText(txt_msg.text.toString()) 
            .setChooserTitle("Notifications") 
            .setType("text/plain") 
            .startChooser() 
    } 
} 

Fragment_activity1.xml 

<?xml version="1.0" encoding="utf-8"?> 
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    android:background="@android:color/background_dark" 
    tools:context=".activity1"> 
 
    <!-- TODO: Update blank fragment layout --> 
    <TextView 
        android:layout_width="wrap_content" 
        android:textSize="39dp" 
        android:layout_height="wrap_content" 
        android:layout_gravity="center" 
        android:textColor="@android:color/holo_orange_dark" 
        android:text="Activity1" /> 
 
 
 
</FrameLayout> 

Fragment_activity2.xml 

<?xml version="1.0" encoding="utf-8"?> 
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    android:background="@android:color/holo_blue_bright" 
    tools:context=".Activity2"> 
 
    <!-- TODO: Update blank fragment layout --> 
    <TextView 
        android:layout_width="wrap_content" 
        android:textSize="39dp" 
        android:layout_height="wrap_content" 
        android:layout_gravity="center" 
        android:textColor="@android:color/holo_orange_dark" 
        android:text="Activity1" /> 
 
</FrameLayout> 
