package com.example.displaycontactslists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Create a list of contacts
        val contacts = mutableListOf(
            ContactClass.ContactData(
                "caren",
                "aluoch@gmail.com",
                "+254789453",
                imageResId = R.drawable.avatar
            ),
            ContactClass.ContactData(
                "verolyne",
                "vera@gmail.com",
                "+2567894532",
                imageResId = R.drawable.avatar
            ),
            ContactClass.ContactData(
                "Sylvia",
                "sylvia@gmail.com",
                "0785645342",
                imageResId = R.drawable.avatar
            ),
            ContactClass.ContactData(
                "Caren",
                "Aluoch",
                "aluochcaren@gmail.com",
                imageResId = R.drawable.avatar
            ),
            ContactClass.ContactData(
                "Eunice",
                "eunicemelvine@gmail.com",
                "075649384",
                imageResId = R.drawable.avatar
            ),
            ContactClass.ContactData(
                "Eunice",
                "eunicemusembi@gmai.com",
                "0798032356",
                imageResId = R.drawable.avatar
            ),
            ContactClass.ContactData(
                "Jared",
                "otienojery@gmail.com",
                "0789457458",
                imageResId = R.drawable.avatar
            )
        )
        // Create a recycler view and set the adapter
        val recyclerView = findViewById<RecyclerView>(R.id.rvContact)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactRvAdapter(contacts)
    }
}


