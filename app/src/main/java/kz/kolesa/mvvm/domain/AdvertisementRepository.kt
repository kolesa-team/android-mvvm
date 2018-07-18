package kz.kolesa.mvvm.domain

/**
 *
 */
interface AdvertisementRepository {

    fun getAdvertisements(): List<Advertisement>
}