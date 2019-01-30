package com.example.trademe_tech_test

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        init()
    }

    private fun init() {
        button2.setOnClickListener {
            val intent = Intent(this@CategoryActivity, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}