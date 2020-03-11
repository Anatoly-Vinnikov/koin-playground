package com.avinnikov.koinplayground.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.avinnikov.koinplayground.R
import com.avinnikov.koinplayground.viewmodel.ViewModelViewModel
import com.avinnikov.koinplayground.extensions.inflate
import kotlinx.android.synthetic.main.view_model_fragment.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ViewModelFragment : Fragment() {

    private val viewModel by viewModel<ViewModelViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            container?.inflate(R.layout.view_model_fragment)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModelTv.text = viewModel.getStrFromController()
    }
}