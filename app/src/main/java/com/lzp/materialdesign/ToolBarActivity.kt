package com.lzp.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tool_bar.*

class ToolBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)
        setSupportActionBar(tool_bar)
        tool_bar.subtitle = "test"
        tool_bar.showOverflowMenu()
        tool_bar.collapseActionView()
        tool_bar.navigationIcon = getDrawable(R.drawable.ic_launcher_foreground)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.back -> Toast.makeText(this, "back click", Toast.LENGTH_SHORT).show()
            R.id.search -> Toast.makeText(this, "search click", Toast.LENGTH_SHORT).show()
            R.id.menu ->  Toast.makeText(this, "menu click", Toast.LENGTH_SHORT).show()
        }
        return true
    }

}
