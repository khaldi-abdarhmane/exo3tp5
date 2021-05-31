package com.example.exo3tp5

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
/*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1= Plombiy(plombiyId=12,firstName = "khaldi",lastName = "abdarhmane",speciality ="les_tue")

     //   val textView=findViewById<TextView>(R.id.textView)
      //  val textView1=findViewById<TextView>(R.id.textView2)
      //  val textView2=findViewById<TextView>(R.id.textView3)
       // val textView3=findViewById<TextView>(R.id.textView4)


           RoomService.database.getPlombiyDao().addPlombiy(p1)

        /*
        val p2: List<Plombiy> = RoomService.database.getPlombiyDao().selectDocteur("khaldi")

            textView.text= p2[1].firstName

            textView1.text=p2[1].plombiyId.toString()
            textView2.text=p2[1].lastName
            textView3.text=p2[1].speciality */


    }
}


 */


import android.os.Bundle
import android.widget.Toast

import java.text.SimpleDateFormat
import java.util.*

//main activity de notre application
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //déclarer les instances
        val Plombiy1 = Plombiy(0, "khaldi", "abdarhmane", "spsali1")
        val Plombiy2 = Plombiy(0, "", "Bakha", "Mohamed Issam")

        val textView = findViewById<TextView>(R.id.textView5)
        RoomService.database.getPlombiyDao().deletePlombiy(Plombiy1)

        textView.text = "kk"


    }

}