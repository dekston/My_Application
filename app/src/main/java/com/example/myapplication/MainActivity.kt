package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener{showName()}

    }
    private fun showName(){
        textViewName.setText("Fung Wai Lun")

    }
}
