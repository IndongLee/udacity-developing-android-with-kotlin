package com.example.miwok_translator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_numbers.setOnClickListener {
            startActivity(Intent(this, NumbersActivity::class.java))
        }

        tv_family.setOnClickListener {
            startActivity(Intent(this, FamilyActivity::class.java))
        }

        tv_phrases.setOnClickListener {
            startActivity(Intent(this, PhrasesActivity::class.java))
        }

        tv_colors.setOnClickListener {
            startActivity(Intent(this, ColorsActivity::class.java))
        }
    }
}
