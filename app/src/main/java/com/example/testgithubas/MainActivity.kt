package com.example.testgithubas

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var isStart = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonStart = findViewById<Button>(R.id.button)
        buttonStart.setOnClickListener {
            if (isStart) {
                buttonStart.text = getString(R.string.start)
                isStart = false
            } else {
                buttonStart.text = getString(R.string.stop)
                isStart = true
            }
        }
    }
}