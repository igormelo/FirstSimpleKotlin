package com.igormelo.firstkotlinproject

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById(R.id.textView) as TextView
        val alerta = AlertDialog.Builder(this)
        val next = findViewById(R.id.button) as Button

        next.setOnClickListener {
            val intent: Intent = Intent()
            setResult(Activity.RESULT_OK, intent)
            alerta.setMessage("My First kotlin example")
            alerta.show()
            text.setText("Text has been changed")
        }
    }
}
