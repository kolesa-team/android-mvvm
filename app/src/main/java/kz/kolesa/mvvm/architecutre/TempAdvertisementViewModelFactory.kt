package kz.kolesa.mvvm.architecutre

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import kz.kolesa.mvvm.advertisements.AdvertisementViewModel
import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.repository.AdvertisementRepository

class TempAdvertisementViewModelFactory(
        private val advertisementRepository: AdvertisementRepository,
        private var onAdvertisementClicked: ((Advertisement) -> Unit)?
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return AdvertisementViewModel(advertisementRepository, onAdvertisementClicked) as T
    }
}