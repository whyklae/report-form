package com.inafianti.reportform

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var name: TextView
    private lateinit var surname: TextView
    private lateinit var age: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        name = findViewById(R.id.name_show)
        surname = findViewById(R.id.surname_show)
        age = findViewById(R.id.age_show)

        name.text = getString(R.string.answer_name, intent.getStringExtra("name"))
        surname.text = getString(R.string.answer_surname, intent.getStringExtra("surname"))
        age.text = getString(R.string.answer_age, intent.getStringExtra("age"))
    }
}