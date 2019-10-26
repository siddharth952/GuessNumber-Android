package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomNumber()
    }


    fun submitButtonClick(view:View){
        val userInput = findViewById<EditText>(R.id.userInput)
        val alertLbl = findViewById<TextView>(R.id.alertLabel)


        if(userInput.text.toString().toInt() > num )
            alertLbl.text = "Hint: High"
        else if(userInput.text.toString().toInt() < num)
            alertLbl.text = "Hint: Low"
        else
            alertLbl.text = "You got it!!"



    }


    fun randomNumber(){
        val r = Random()
        num = r.nextInt(1000)
    }


}
