package com.example.exo3tp5

import androidx.room.*
import java.util.*

//l'interface pour manipuler la table de booking
@Dao
interface interventionsDao {
    @Insert
    fun addnterventions(interventions: interventions)
    @Update
    fun updatenterventions(interventions: interventions)
    @Delete
    fun deletenterventions(interventions: interventions)
    @Query("SELECT * FROM tab_interventions WHERE interventionDate=:interventionDate")
    fun selectnterventions(interventionDate:Date):List<interventions>

}

