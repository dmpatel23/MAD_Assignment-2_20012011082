package com.example.mad_assignment_2_20012011082


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat
import java.util.Locale;

class Second : AppCompatActivity() {

    private lateinit var kilometers: EditText
    private lateinit var mileage: EditText
    private lateinit var price: EditText
    private lateinit var calculateButton: Button
    private lateinit var fareTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        kilometers = findViewById(R.id.Kilometers)
        mileage = findViewById(R.id.Mileage)
        price = findViewById(R.id.Price)
        calculateButton = findViewById(R.id.Calculate)
        fareTextView = findViewById(R.id.Fare)

        calculateButton.setOnClickListener { calculateFare() }
    }

    private fun calculateFare() {
        val kms = kilometers.text.toString()
        val distance = kms.toDouble()

        val avg = mileage.text.toString()
        val average = avg.toDouble()

        val rs = price.text.toString()
        val petrol = rs.toDouble()

        val myExpense =
            (distance.toBigDecimal().div(average.toBigDecimal())) * petrol.toBigDecimal()
        val fare = myExpense + myExpense

        val formattedFare = NumberFormat.getCurrencyInstance(Locale("en", "IN")).format(fare)
        fareTextView.text = getString(R.string.Total, formattedFare)
    }
}



