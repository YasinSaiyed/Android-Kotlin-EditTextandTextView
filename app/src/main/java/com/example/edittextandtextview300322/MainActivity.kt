package com.example.edittextandtextview300322

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val editText = findViewById<EditText>(R.id.editText)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val textView5 = findViewById<TextView>(R.id.textView5)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener(){
            val inputValue: String = editText.text.toString()
            if (inputValue == null || inputValue.trim()==""){
                Toast.makeText(this,"please input data, edit text cannot be blank",Toast.LENGTH_LONG).show()
            }else{
                textView4.setText(inputValue).toString()
            }
        }

        textView5.setOnClickListener(){
            if (textView4.text.toString() == null || textView4.text.toString().trim()==""){
                Toast.makeText(this,"clicked on reset textView,\n output textView already reset",Toast.LENGTH_LONG).show()
            }else{
                textView4.setText("").toString()
                editText.setText("").toString()
            }
        }
    }
}