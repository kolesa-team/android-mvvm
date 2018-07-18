package kz.kolesa.mvvm.advertisements

import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.navigator.Navigator

/**
 * @author marshal@kolesa.kz
 */
class AdvertisementCoordinator(private val navigator: Navigator) {

    fun start() {
        navigator.showAdvertisementList()
    }

    fun onAdvertisementClicked(advertisement: Advertisement) {
        navigator.showAdvertisement(advertisement)
    }
}