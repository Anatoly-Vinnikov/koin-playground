package com.avinnikov.koinplayground.data

import android.content.Context
import com.avinnikov.koinplayground.R

class Controller(val service: BusinessService, private val context: Context) {
    fun strForViewModel() = "${service.getStr()} ${context.getString(R.string.viewmodel_text)}"
}