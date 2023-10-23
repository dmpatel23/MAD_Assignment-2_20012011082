package com.example.mad_assignment_2_20012011082

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.btn_login)
        val username = findViewById<EditText>(R.id.txt_username)
        val password = findViewById<EditText>(R.id.txt_password)

        button1.setOnClickListener {
            if (username.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show()
            } else if (password.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show()
            } else if (password.text.toString().length < 8) {
                Toast.makeText(this, "Please enter a valid password (at least 8 characters)", Toast.LENGTH_SHORT).show()
            } else {
                // If conditions are met, navigate to the Second activity
                val intent = Intent(this, Second::class.java)
                startActivity(intent)
            }
        }
    }
}
