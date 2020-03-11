package com.avinnikov.koinplayground.data.set

import android.util.Log

class ImplementationTwo : TestInterface {
    override fun printText() {
        Log.d("timber", "Hello from two")
    }
}