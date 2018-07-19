package kz.kolesa.mvvm.advertisements

import kz.kolesa.mvvm.domain.Advertisement

/**
 * @author marshal@kolesa.kz
 */
fun createAdvertisement(
        id: Long = 1L,
        title: String = "Tesla Model X",
        price: String = "64 543 300 ₸",
        photoPath: String = "https://alaps-photos-kl.kcdn.kz/fd/466e34fc228b0a81bc422e6d45f799/1-full.jpg"
) = Advertisement(id, title, price, photoPath)