package com.example.exo3tp5

import androidx.room.*
//l'interface pour manipuler la table de docteur
@Dao
interface PlombiyDao {
    @Insert
    fun addPlombiy(plombiy: Plombiy)
    @Update
    fun updatePlombiy(plombiy: Plombiy)
    @Delete
    fun deletePlombiy(plombiy: Plombiy)
    @Query("SELECT * FROM les_plombiy WHERE firstName=:firstName")
        fun selectDocteur(firstName:String):List<Plombiy>

    }



