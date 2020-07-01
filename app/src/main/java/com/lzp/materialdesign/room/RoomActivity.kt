package com.lzp.materialdesign.room

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.lzp.materialdesign.R
import kotlinx.android.synthetic.main.activity_room.*
import kotlin.concurrent.thread

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val userDao = AppDatabase.getDatabase(this).userDao()

        val user1 = User("Tom", "Brady", 40)
        val user2 = User("Tom", "Hanks", 60)

        addDataBtn.setOnClickListener {
            thread {
                user1.id = userDao.insertUser(user1)
                user2.id = userDao.insertUser(user2)
            }
        }

        updateDataBtn.setOnClickListener {
            thread {
                user1.age = 42
                userDao.updateUser(user1)
            }
        }

        delete.setOnClickListener {
            thread {
                userDao.deleteUserByLastName("Hanks")
            }
        }

        query.setOnClickListener {
            thread {
                for (user in userDao.loadAllUsers()) {
                    Log.e("MainActivity", user.toString())
                }
            }
        }

    }
}