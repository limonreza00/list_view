package com.coderscastle.listview

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val data = listOf(
            Users("Sam",25,"123"),
            Users("Arif",21,"123556"),
            Users("Asif",22,"123456"),
            Users("Robert",23,"986556"),
            Users("Arif",21,"123556"),
            Users("Asif",22,"123456"),
            Users("Chris",23,"986556"),
            Users("Arif",21,"123556"),
            Users("Asif",22,"123456"),
            Users("Evans",23,"986556"),
            Users("Arif",21,"123556"),
            Users("Asif",22,"123456"),
            Users("Natasha",23,"986556"),
            Users("Arif",21,"123556"),
            Users("Asif",22,"123456"),
            Users("Scarlett",23,"986556"),
        )
        val adapter = Adapter(this,data)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter
    }
}