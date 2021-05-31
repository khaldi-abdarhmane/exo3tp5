package com.example.exo3tp5

import androidx.room.Entity
import androidx.room.PrimaryKey

//la table de docteur
@Entity(tableName = "les_plombiy")
 class Plombiy{
//les attributs de docteur
@PrimaryKey
var plombiyId:Long? = null
        public var firstName:String? = null
public var lastName:String? = null
public var speciality:String?


        constructor(plombiyId:Long,firstName: String?, lastName: String?, speciality: String) {
                this.plombiyId=plombiyId
                this.firstName = firstName
                this.lastName = lastName
                this.speciality = speciality
        }


}


