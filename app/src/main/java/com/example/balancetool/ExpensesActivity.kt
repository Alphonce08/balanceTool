package com.example.balancetool

import android.app.ProgressDialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class ExpensesActivity : AppCompatActivity() {
    lateinit var dateinput: TextView
    lateinit var listtable: ListView
    lateinit var sumtotal: Button
    lateinit var progress: ProgressDialog
    lateinit var filepath: Uri
    lateinit var firebaseStore: FirebaseStorage
    lateinit var storageReference: StorageReference
    lateinit var mAuth: FirebaseAuth
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_expenses)
                dateinput = findViewById(R.id.mBeditDate)
                listtable = findViewById(R.id.mListExpenses)
                sumtotal = findViewById(R.id.BtnTotalExpenses)
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
                    data class Item(val name: String, val price: Double)

                    fun main() {
                        val items = mutableListOf<Item>()

                        // Prompting the user to enter item details
                        while (true) {
                            print("Enter item name (or 'done' to finish): ")
                            val itemName = readLine()?.trim()
                            if (itemName.equals("done", ignoreCase = true)) {
                                break
                            }
                            print("Enter item price: ")
                            val itemPrice = readLine()?.toDoubleOrNull()

                            if (itemPrice != null) {
                                items.add(Item(itemName!!, itemPrice))
                            } else {
                                println("Invalid price. Please enter a valid number.")
                            }
                        }
                        // Printing the list of items
                        for (item in items) {
                            println("Item: ${item.name}, Price: ${item.price}")
                        }
                    }
                    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
                    val sum = numbers.sum()
                    println("Sum: $sum")
                }
            }
   }

