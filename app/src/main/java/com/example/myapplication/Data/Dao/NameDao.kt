package com.example.myapplication.Data.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.Data.Entity.Name


@Dao
interface NameDao {
    @Query("SELECT * FROM name")
    fun getAll(): List<Name>
    @Insert
    fun insertAll(vararg name: Name)

    @Delete
    fun delete(name: Name)

}

//define un DAO llamado NameDao.
// NameDao proporciona los métodos que el resto de la app usa para interactuar con los datos de la tabla user.