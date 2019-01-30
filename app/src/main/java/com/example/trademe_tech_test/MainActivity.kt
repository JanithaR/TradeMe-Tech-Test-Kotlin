package com.example.trademe_tech_test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hello World", Toast.LENGTH_SHORT).show()

            val intent = Intent(this@MainActivity, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}
