package kz.kolesa.mvvm.main

import android.arch.lifecycle.ViewModel
import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.domain.AdvertisementRepository

class MyViewModel(
        private val advertisementRepository: AdvertisementRepository
) : ViewModel() {

    fun onAdvertClicked(advertisement: Advertisement) {
        TODO()
    }
}