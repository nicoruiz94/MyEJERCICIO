package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.myapplication.Data.Dao.NameDao
import com.example.myapplication.Data.Entity.AppDatabase
import com.example.myapplication.Data.Entity.Name

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private val db = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java, "database-name"
    ).build()
    val NameDao = db.nameDao()
    val name: List<Name> =NameDao.getAll()
}