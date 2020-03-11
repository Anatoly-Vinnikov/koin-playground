package com.avinnikov.koinplayground.viewmodel

import androidx.lifecycle.ViewModel
import com.avinnikov.koinplayground.data.Controller

class ViewModelViewModel(private val controller: Controller) : ViewModel() {
    fun getStrFromController() = controller.strForViewModel()
}