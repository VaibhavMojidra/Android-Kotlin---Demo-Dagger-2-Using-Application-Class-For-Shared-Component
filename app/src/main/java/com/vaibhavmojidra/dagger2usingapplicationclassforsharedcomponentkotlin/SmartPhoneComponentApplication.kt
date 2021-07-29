package com.vaibhavmojidra.dagger2usingapplicationclassforsharedcomponentkotlin

import android.app.Application

class SmartPhoneComponentApplication:Application() {
    lateinit var smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        super.onCreate()
        smartPhoneComponent=initDagger()
    }
    fun initDagger():SmartPhoneComponent= DaggerSmartPhoneComponent
        .create()
}