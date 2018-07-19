package kz.kolesa.mvvm.data

import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.repository.AdvertisementRepository

/**
 * @author marshal@kolesa.kz
 */
class DefaultAdvertisementRepository : AdvertisementRepository {

    override suspend fun getAdvertisements(): List<Advertisement> {
        return listOf(
                Advertisement(1, "Iphone SE 16gb rose gold", "60 000 ₸", "https://alaps-photos-mt.kcdn.kz/e8/9275b7bd431143297f66d881bcba4e/1-200x150.jpg"),
                Advertisement(2, "Смарт часы-телефон Smart Watch Y1 КАЧЕСТВО!", "9 000 ₸", "https://alaps-photos-mt.kcdn.kz/43/786c4241f04bc69262ac6124a9fcf8/1-200x150.jpg"),
                Advertisement(3, "Фотоаппарат Canon EOS-7D", "140 000 ₸", "https://alaps-photos-mt.kcdn.kz/ab/a08a3cd25388954d40164326446650/1-200x150.jpg"),
                Advertisement(4, "Samsung Galaxy s7 (отличное состояние)", "79 000 ₸", "https://alaps-photos-mt.kcdn.kz/ee/dc0a7a0b9d433159ae71613c8bb4e7/1-200x150.jpg"),
                Advertisement(5, "Смарт Часы X6 Smart Watch/smart watch/аналог apple watch/Умные часы!", "9 000 ₸", "https://alaps-photos-mt.kcdn.kz/60/4beb22a28015c0d2bd4809c56c7518/1-200x150.jpg")
        )
    }
}