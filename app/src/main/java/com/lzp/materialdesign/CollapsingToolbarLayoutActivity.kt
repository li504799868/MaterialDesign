package com.lzp.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_collapsing_toolbar_layout.*

class CollapsingToolbarLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_toolbar_layout)

        setSupportActionBar(tool_bar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        collapsingToolbar.title = "title"
    }
}
