package kz.kolesa.mvvm.repository

import kz.kolesa.mvvm.domain.Advertisement

/**
 *
 */
interface AdvertisementRepository {

    fun getAdvertisements(): List<Advertisement>
}