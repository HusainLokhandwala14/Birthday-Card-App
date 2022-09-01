package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayCard : AppCompatActivity() {


    companion object {
        const val NAME_EXTRA = "NAME_EXTRA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)

        val name = intent.getStringExtra("NAME_EXTRA")

        val birthdaygreet: TextView = findViewById(R.id.cardtext)


        birthdaygreet.text = "Happy Birthday \n $name !"


    }
}