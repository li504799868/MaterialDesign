package com.lzp.materialdesign

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_navigation_view.*

class NavigationViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_view)
        navigationview.setNavigationItemSelectedListener {
            Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show()
            true
        }
    }
}
