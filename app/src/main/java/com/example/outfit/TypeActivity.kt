package com.example.outfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_category.*
import kotlinx.android.synthetic.main.activity_type.*

class TypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type)

        buttonShortSkirt.setOnClickListener {
            val intent = Intent(this, CasualActivity::class.java)
            startActivity(intent)
        }

        buttonDating.setOnClickListener {
            val intent = Intent(this, DatingActivity::class.java)
            startActivity(intent)
        }

    }
}
