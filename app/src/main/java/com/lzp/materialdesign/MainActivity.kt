package com.lzp.materialdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lzp.materialdesign.room.RoomActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tool_bar.setOnClickListener {
            start<ToolBarActivity>()
        }

        navigationview.setOnClickListener {
            start<NavigationViewActivity>()
        }

        floatactionbutton.setOnClickListener {
            start<FloatActionButtonActivity>()
        }

        appbar.setOnClickListener {
            start<AppBarLayoutActivity>()
        }
        collapsingToolbar.setOnClickListener {
            start<CollapsingToolbarLayoutActivity>()
        }

        room.setOnClickListener {
            start<RoomActivity>()
        }
    }

}

