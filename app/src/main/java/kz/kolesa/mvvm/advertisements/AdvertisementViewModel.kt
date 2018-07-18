package kz.kolesa.mvvm.advertisements

import android.arch.lifecycle.ViewModel
import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.repository.AdvertisementRepository

class AdvertisementViewModel(
        private val advertisementRepository: AdvertisementRepository
) : ViewModel() {

    fun onStart() {
        TODO()
    }

    fun onAdvertClicked(advertisement: Advertisement) {
        TODO()
    }
}