package com.example.tv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// PUBLIC_INTERFACE
class MainActivity : AppCompatActivity() {
    /** Minimal launcher activity for the Android TV app. Sets the main layout. */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
