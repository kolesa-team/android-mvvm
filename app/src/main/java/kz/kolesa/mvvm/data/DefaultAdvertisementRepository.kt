package kz.kolesa.mvvm.data

import kz.kolesa.mvvm.domain.Advertisement
import kz.kolesa.mvvm.repository.AdvertisementRepository

/**
 * @author marshal@kolesa.kz
 */
class DefaultAdvertisementRepository : AdvertisementRepository {

    override suspend fun getAdvertisements(): List<Advertisement> {
        return listOf(
                Advertisement(1, "Mitsubishi Outlander", "8 900 000 ₸", "https://alaps-photos-kl.kcdn.kz/15/5c55fdcf636ce4e1290404cc26ff50/25-160x120.jpg"),
                Advertisement(2, "Toyota Camry", "3 400 000 ₸", "https://alaps-photos-kl.kcdn.kz/d0/762f6f3874336318ace38ee0f7bbe5/1-full.jpg"),
                Advertisement(3, "Honda CR-V", "2 500 000 ₸", "https://alaps-photos-kl.kcdn.kz/fc/eb2ac06f2d3fb47e23f247d1a72c18/10-full.jpg"),
                Advertisement(4, "Toyota RAV 2011 года", "6 700 000 ₸", "https://alaps-photos-kl.kcdn.kz/bd/41b49b9d67d67a2470c96c5f956a0c/6-full.jpg"),
                Advertisement(5, "ВАЗ (Lada) 2190 (седан) 2014 года", "1 600 000 ₸", "https://alaps-photos-kl.kcdn.kz/24/efaaef572c6583008b5dae5f7e70ca/1-full.jpg")
        )
    }
}