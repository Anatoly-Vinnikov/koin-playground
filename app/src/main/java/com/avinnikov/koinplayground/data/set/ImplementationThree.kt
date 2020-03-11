package com.avinnikov.koinplayground.data.set

import android.util.Log

class ImplementationThree : TestInterface {
    override fun printText() {
        Log.d("timber", "Hello from three")
    }
}