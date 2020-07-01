package com.lzp.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_float_action_button.*

class FloatActionButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_float_action_button)

        button.setOnClickListener {
            Snackbar.make(it, "Click", Snackbar.LENGTH_SHORT).setAction("delete"){
                Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show()
            }.show()
        }
    }
}
