package com.example.balancetool

import android.app.ProgressDialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.core.view.isEmpty
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference


class ExpensesActivity : AppCompatActivity() {
    lateinit var dateinput:TextView
    lateinit var listtable:ListView
    lateinit var sumtotal:Button
    lateinit var progress:ProgressDialog
    lateinit var filepath: Uri
    lateinit var firebaseStore: FirebaseStorage
    lateinit var storageReference: StorageReference
    lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expenses)
        dateinput = findViewById(R.id.mBeditDate)
        listtable = findViewById(R.id.mList)
        sumtotal = findViewById(R.id.mBtnSum)
        progress = ProgressDialog(this)
        firebaseStore = FirebaseStorage.getInstance()
        storageReference = firebaseStore.getReference()
        mAuth = FirebaseAuth.getInstance()

        dateinput.setOnClickListener {
            var date = dateinput.text.toString().trim()
            if (date.isEmpty()){
                dateinput.setError("Fill this field...")
                dateinput.requestFocus()
            }
        }
        listtable.setOnClickListener {
            var list = listtable
            if (list.isEmpty()){


            }
        }


    }


}