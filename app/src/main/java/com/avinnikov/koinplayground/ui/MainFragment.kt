package com.avinnikov.koinplayground.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.avinnikov.koinplayground.navigator.Navigator
import com.avinnikov.koinplayground.R
import com.avinnikov.koinplayground.data.Controller
import com.avinnikov.koinplayground.extensions.inflate
import kotlinx.android.synthetic.main.fragment_main.*
import org.koin.android.ext.android.inject

class MainFragment : Fragment() {

    private val controller: Controller by inject()
    private val navigator: Navigator by inject()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            container?.inflate(R.layout.fragment_main)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainTv.text = controller.service.getStr()

        mainTv.setOnClickListener {
            navigator.toViewModel()
        }
    }
}