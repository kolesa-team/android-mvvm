package kz.kolesa.mvvm.advertisements

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch
import kz.kolesa.mvvm.architecutre.CoroutineContextProvider
import kz.kolesa.mvvm.livedata.Event
import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.repository.AdvertisementRepository

class AdvertisementViewModel(
        private val advertisementRepository: AdvertisementRepository,
        private var onAdvertisementClicked: ((Advertisement) -> Unit)?,
        private val coroutineContextProvider: CoroutineContextProvider = CoroutineContextProvider()
) : ViewModel() {

    private val advertisementsLiveData = MutableLiveData<List<Advertisement>>()
    private val progressLiveData = MutableLiveData<Boolean>()
    private val messageLiveData = MutableLiveData<Event<String>>()

    fun getAdvertisementLiveData(): LiveData<List<Advertisement>> = advertisementsLiveData

    fun getProgressLiveData(): LiveData<Boolean> = progressLiveData

    fun onStart() {
        advertisementsLiveData.value?.let {
            if (it.isEmpty()) {
                loadAdvertisements()
            }
        } ?: loadAdvertisements()
    }

    fun onAdvertClicked(advertisement: Advertisement) {
        onAdvertisementClicked?.invoke(advertisement)
    }

    private fun loadAdvertisements() = launch(coroutineContextProvider.main) {
        progressLiveData.value = true
        val advertisements = async(coroutineContextProvider.io) {
            advertisementRepository.getAdvertisements()
        }.await()
        advertisementsLiveData.value = advertisements
        progressLiveData.value = false
    }
}