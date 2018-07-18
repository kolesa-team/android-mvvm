package kz.kolesa.mvvm.repository

import android.support.annotation.WorkerThread
import kz.kolesa.mvvm.domain.Advertisement

/**
 *
 */
interface AdvertisementRepository {

    @WorkerThread
    suspend fun getAdvertisements(): List<Advertisement>
}