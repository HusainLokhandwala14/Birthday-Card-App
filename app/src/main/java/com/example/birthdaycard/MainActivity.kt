package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)





        }

    fun createCard(view: View) {


        val name = findViewById<TextView>(R.id.inputtext).editableText.toString()
        val intent : Intent = Intent(this , BirthdayCard::class.java)

        intent.putExtra(BirthdayCard.NAME_EXTRA , name)


        startActivity(intent)

    }


}





