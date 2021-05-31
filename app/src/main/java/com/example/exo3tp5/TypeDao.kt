package com.example.exo3tp5

import androidx.room.*
//l'interface pour manipuler la table de docteur
@Dao
interface TypeDao {
    @Insert
    fun addType(type_: type_)
    @Update
    fun updateType(type_: type_)
    @Delete
    fun deleteType(type_: type_)
    @Query("SELECT * FROM tabl_type WHERE nomTyupe=:nomTyupe")
        fun selectType(nomTyupe:String):List<type_>

    }



