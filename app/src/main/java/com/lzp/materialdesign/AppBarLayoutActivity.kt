package com.lzp.materialdesign

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_app_bar_layout.*
import kotlin.concurrent.thread

class AppBarLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_bar_layout)

        refresh_layout.setProgressBackgroundColorSchemeColor(Color.BLACK)
        refresh_layout.setColorSchemeColors(Color.BLUE, Color.CYAN, Color.LTGRAY)
        refresh_layout.setOnRefreshListener {
            thread {
                Thread.sleep(1000)
                runOnUiThread {
                    refresh_layout.isRefreshing = false
                }
            }
        }

        list.layoutManager = LinearLayoutManager(this)
        list.adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

            override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
            ): RecyclerView.ViewHolder {
                return MyViewHolder(
                    layoutInflater.inflate(
                        R.layout.item_layout,
                        parent,
                        false
                    )
                )
            }

            override fun getItemCount(): Int = 100

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            }

            inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            }

        }
    }
}
