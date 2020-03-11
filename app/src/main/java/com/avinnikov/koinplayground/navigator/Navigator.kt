package com.avinnikov.koinplayground.navigator

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.avinnikov.koinplayground.R

class Navigator(private val activity: AppCompatActivity) {
    private fun findNavigator(): NavController =
            activity.findNavController(R.id.navHostFragment)

    fun toViewModel() {
        Toast.makeText(activity, "Toast from Navigator", Toast.LENGTH_LONG).show()
        findNavigator().navigate(R.id.actionGlobalToViewModelFragment)
    }
}