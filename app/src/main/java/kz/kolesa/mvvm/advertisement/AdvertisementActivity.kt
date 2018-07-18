package kz.kolesa.mvvm.advertisement

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kz.kolesa.mvvm.R
import kz.kolesa.mvvm.navigator.ADVERTISEMENT_ID

private const val NO_ADVERTISEMENT_ID = -1L

/**
 * @author marshal@kolesa.kz
 */
class AdvertisementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertisement)
        val advertisementId = intent.getLongExtra(ADVERTISEMENT_ID, NO_ADVERTISEMENT_ID)
    }
}