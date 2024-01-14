package com.example.myapplication.Data.Entity

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.Data.Dao.NameDao
import com.example.myapplication.Data.Entity.Name

//Base de datos


@Database(entities = [Name::class], version = 1)
abstract class AppDatabase :RoomDatabase () {
    abstract fun nameDao ():NameDao
}

//se define una clase AppDatabase para contener la base de datos.