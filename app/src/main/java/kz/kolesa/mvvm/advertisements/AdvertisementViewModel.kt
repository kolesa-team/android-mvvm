package kz.kolesa.mvvm.advertisements

import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch
import kz.kolesa.mvvm.architecutre.CoroutineContextProvider
import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.repository.AdvertisementRepository

class AdvertisementViewModel(
        private val advertisementRepository: AdvertisementRepository,
        private var onAdvertisementClicked: ((Advertisement) -> Unit)?,
        private val coroutineContextProvider: CoroutineContextProvider = CoroutineContextProvider()
) : ViewModel() {

    fun onStart() {
        launch(coroutineContextProvider.Main) {
            val advertisements: List<Advertisement> = async(coroutineContextProvider.IO) {
                advertisementRepository.getAdvertisements()
            }.await()
        }
    }

    fun onAdvertClicked(advertisement: Advertisement) {
        onAdvertisementClicked?.invoke(advertisement)
    }
}