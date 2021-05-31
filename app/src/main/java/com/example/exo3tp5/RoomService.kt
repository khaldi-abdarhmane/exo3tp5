package com.example.exo3tp5

import android.content.Context
import android.provider.ContactsContract
import androidx.room.Room
//singeleton de room
object RoomService {
    lateinit var context:Context
    val database by lazy {
        Room.databaseBuilder(context, Database::class.java,"db")
            .allowMainThreadQueries().build()

    }
}