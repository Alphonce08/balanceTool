package com.example.balancetool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import java.util.Date

lateinit var RecDate:Date
lateinit var RecList:ListView
lateinit var RecSumTotal:Button
class ReceivedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_received)

    }
}