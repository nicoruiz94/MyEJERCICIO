package com.example.myapplication.Data.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Name(
    @PrimaryKey val uid: Int,
    val name: String?
)

//Entidad de datos
//El siguiente código define una entidad de datos Name.
// Cada instancia de Name representa una fila en una tabla de name en la base de datos de la app.