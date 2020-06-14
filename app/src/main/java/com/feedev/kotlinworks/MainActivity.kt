package com.feedev.kotlinworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fm=supportFragmentManager
        val ft=fm.beginTransaction();

        ft.add(R.id.frameLayout,BlankFragment())
        ft.add(R.id.framelayout2,BlankFragment2())
        ft.commit()

        
    }
}
