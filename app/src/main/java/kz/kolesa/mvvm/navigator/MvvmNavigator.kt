package kz.kolesa.mvvm.navigator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import kz.kolesa.mvvm.R
import kz.kolesa.mvvm.advertisement.AdvertisementActivity
import kz.kolesa.mvvm.advertisements.AdvertisementListFragment
import kz.kolesa.mvvm.domain.Advertisement

/**
 * @author marshal@kolesa.kz
 */
class MvvmNavigator(
        private val activity: AppCompatActivity? = null
) : Navigator {
    override fun showAdvertisementList() {
        val fragment = AdvertisementListFragment()
        activity?.apply {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit()
        }
    }

    override fun showAdvertisement(advertisement: Advertisement) {
        Intent(activity, AdvertisementActivity::class.java).apply {
            putExtra(ADVERTISEMENT_ID, advertisement.id)
        }.let { activity?.startActivity(it) }
    }
}