package com.example.exo3tp5

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

//cette classe représentre notre base de données
@Database(entities = arrayOf(Plombiy::class,interventions::class,type_::class),version=1)
@TypeConverters(Converter::class)
abstract class Database: RoomDatabase() {
    abstract fun getPlombiyDao():PlombiyDao
    abstract fun getInterventionsDao():interventionsDao
    abstract fun getTypeDao():TypeDao

}