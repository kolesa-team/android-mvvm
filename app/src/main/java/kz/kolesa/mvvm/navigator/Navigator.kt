package kz.kolesa.mvvm.navigator

import kz.kolesa.mvvm.domain.Advertisement

/**
 * @author marshal@kolesa.kz
 */
interface Navigator {
    fun showAdvertisementList()

    fun showAdvertisement(advertisement: Advertisement)

}