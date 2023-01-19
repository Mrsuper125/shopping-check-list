package com.example.shoppingcheck_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class ProductAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_add)

        val buttonAdd : Button = findViewById(R.id.save)

        buttonAdd.setOnClickListener {
            val intent = Intent(this@ProductAddActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}