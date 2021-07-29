package com.vaibhavmojidra.dagger2usingapplicationclassforsharedcomponentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as SmartPhoneComponentApplication)
            .smartPhoneComponent
            .getSmartPhone()
            .makeCallRecording()
    }
}