package kz.kolesa.mvvm.architecutre

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

class MyViewModelFactory(

) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        TODO()
    }
}