package com.example.balancetool

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference


class MainActivity : AppCompatActivity() {
    lateinit var BtnExpenses:Button
    lateinit var BtnReceived:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnExpenses = findViewById(R.id.mBExpenses)
        BtnReceived = findViewById(R.id.mBReceived)

        BtnExpenses.setOnClickListener {
          startActivity(Intent(applicationContext,ExpensesActivity::class.java))
        }
        BtnReceived.setOnClickListener {
            startActivity(Intent(applicationContext,ReceivedActivity::class.java))
        }


    }
}