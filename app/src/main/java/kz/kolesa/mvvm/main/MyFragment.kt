package kz.kolesa.mvvm.main

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

class MyFragment : Fragment() {

    private lateinit var myViewModel: MyViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        myViewModel = createViewModel()
    }

    private fun createViewModel(): MyViewModel {
        TODO()
    }
}