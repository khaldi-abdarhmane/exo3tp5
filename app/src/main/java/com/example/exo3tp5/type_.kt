package com.example.exo3tp5

import androidx.room.Entity
import androidx.room.PrimaryKey

//la table de docteur
@Entity(tableName = "tabl_type")
data class type_(
//les attributs de docteur
        @PrimaryKey(autoGenerate = true)
        val typeId:Long,
        val  nomTyupe:String

)

