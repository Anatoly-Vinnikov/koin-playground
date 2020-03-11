package com.avinnikov.koinplayground.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avinnikov.koinplayground.navigator.Navigator
import com.avinnikov.koinplayground.R
import org.koin.android.ext.android.get
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val navigator: Navigator = get(parameters = {
        parametersOf(this@MainActivity)
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}