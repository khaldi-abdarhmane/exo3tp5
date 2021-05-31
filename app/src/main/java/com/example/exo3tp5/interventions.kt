package com.example.exo3tp5

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

//la table de booking
@Entity(tableName = "tab_interventions",foreignKeys = arrayOf(
    ForeignKey(entity =
    Plombiy::class, parentColumns = arrayOf("plombiyId"),
    childColumns = arrayOf("plombId"),
    onDelete = ForeignKey.CASCADE),
    ForeignKey(entity =
    type_::class, parentColumns = arrayOf("typeId"),
        childColumns = arrayOf("ttypeid"),
        onDelete = ForeignKey.CASCADE)

))

data class interventions(
    //les attributs de booking
    @PrimaryKey
    var interventionId:Long,
    var interventionDate:Date?,
    var destri:String?,
    var plombId:Long?,
    val ttypeid:Long?


)