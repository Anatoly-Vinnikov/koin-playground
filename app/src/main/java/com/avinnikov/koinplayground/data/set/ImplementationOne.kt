package com.avinnikov.koinplayground.data.set

import android.util.Log

class ImplementationOne : TestInterface {
    override fun printText() {
        Log.d("timber", "Hello from one")
    }
}