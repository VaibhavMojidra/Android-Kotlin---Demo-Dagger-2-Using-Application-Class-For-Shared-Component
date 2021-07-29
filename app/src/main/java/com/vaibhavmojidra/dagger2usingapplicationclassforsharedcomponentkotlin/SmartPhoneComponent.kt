package com.vaibhavmojidra.dagger2usingapplicationclassforsharedcomponentkotlin

import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}