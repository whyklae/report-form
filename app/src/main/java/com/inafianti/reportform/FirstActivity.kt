package com.inafianti.reportform

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var age: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        surname = findViewById(R.id.surname)
        age = findViewById(R.id.age)
    }

    fun btnSaveClicked(view: View) {
        val showData = Intent(this, SecondActivity::class.java)
        showData.putExtra("name", name.text.toString())
        showData.putExtra("surname", surname.text.toString())
        showData.putExtra("age", age.text.toString())
        startActivity(showData)
    }
}