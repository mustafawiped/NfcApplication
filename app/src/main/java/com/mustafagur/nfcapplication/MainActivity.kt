package com.mustafagur.nfcapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btnYayin)
        btn.setOnClickListener {
            Log.e("ERR","SAA");
            var intentService = Intent(this@MainActivity, HCEService::class.java)
            startService(intentService)
        }
    }
}