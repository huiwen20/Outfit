package com.example.outfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        buttonCasual.setOnClickListener {
            val intent = Intent(this, CasualActivity::class.java)
            startActivity(intent)
        }

        buttonDating.setOnClickListener {
            val intent = Intent(this, DatingActivity::class.java)
            startActivity(intent)
        }

        buttonDinner.setOnClickListener {
            val intent = Intent(this, DinnerActivity::class.java)
            startActivity(intent)
        }

        buttonFormal.setOnClickListener {
            val intent = Intent(this, FormalActivity::class.java)
            startActivity(intent)
        }

    }
}
