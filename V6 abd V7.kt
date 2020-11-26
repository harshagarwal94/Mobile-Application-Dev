MainActivity.kt 

package com.lecture6 
 
import androidx.appcompat.app.AppCompatActivity 
import android.os.Bundle 
import android.view.Menu 
import android.view.MenuItem 
import android.widget.Toast 
 
class MainActivity : AppCompatActivity() { 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
    } 
 
    override fun onCreateOptionsMenu(menu: Menu?): Boolean { 
         super.onCreateOptionsMenu(menu) 
        menuInflater.inflate(R.menu.menu,menu); 
        return true 
    } 
 
    override fun onOptionsItemSelected(item: MenuItem): Boolean { 
       var sel="" 
        when(item?.itemId) 
        { 
            R.id.sub_profile -> sel="Profile item is selected" 
            R.id.sub_gallery -> sel="Gallery item selected" 
            R.id.signup -> sel="sign up  item selected" 
            R.id.login -> sel="login  item selected" 
            R.id.logout -> sel="log out  item selected" 
        } 
        Toast.makeText(this,sel,Toast.LENGTH_LONG).show(); 
 
 
 
        return super.onOptionsItemSelected(item) 
    } 
 
} 

Menu.xml 

<?xml version="1.0" encoding="utf-8"?> 
<menu xmlns:android="http://schemas.android.com/apk/res/android"> 
   <item 
       android:id="@+id/home" 
       android:title="Home" > 
       <menu> 
           <item 
               android:id="@+id/sub_profile" 
               android:title="profile"/> 
           <item 
               android:id="@+id/sub_gallery" 
               android:title="gallery"/> 
 
 
       </menu> 
 
 
   </item> 
    <item 
        android:id="@+id/signup" 
        android:title="Signup" /> 
    <item 
        android:id="@+id/login" 
        android:title="Login" /> 
    <item 
        android:id="@+id/logout" 
        android:title="Logout" /> 
 
 
 
 
</menu> 

 

 

 

Activitymain.xml 

<?xml version="1.0" encoding="utf-8"?> 
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" 
    xmlns:tools="http://schemas.android.com/tools" 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" 
    tools:context=".MainActivity"> 
 
    <TextView 
        android:id="@+id/t1" 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:text="Welcome to Harsh zone" 
        app:layout_constraintBottom_toBottomOf="parent" 
        app:layout_constraintEnd_toEndOf="parent" 
        app:layout_constraintHorizontal_bias="0.367" 
        app:layout_constraintStart_toStartOf="parent" 
        app:layout_constraintTop_toTopOf="parent" 
        app:layout_constraintVertical_bias="0.205" /> 
 
    <ImageView 
        android:id="@+id/imageView2" 
        android:layout_width="108dp" 
        android:layout_height="98dp" 
        app:layout_constraintBottom_toBottomOf="parent" 
        app:layout_constraintEnd_toEndOf="parent" 
        app:layout_constraintHorizontal_bias="0.205" 
        app:layout_constraintStart_toStartOf="parent" 
        app:layout_constraintTop_toTopOf="parent" 
        app:layout_constraintVertical_bias="0.81" 
        tools:srcCompat="@tools:sample/avatars" /> 
 
</androidx.constraintlayout.widget.ConstraintLayout>
