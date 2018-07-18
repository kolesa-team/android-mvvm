package kz.kolesa.mvvm.advertisements.adapter

import android.support.v7.util.DiffUtil
import kz.kolesa.mvvm.domain.Advertisement

/**
 * @author marshal@kolesa.kz
 */
internal object AdvertisementDiffUtil: DiffUtil.ItemCallback<Advertisement>() {

    override fun areItemsTheSame(oldItem: Advertisement?, newItem: Advertisement?): Boolean {
        return oldItem?.id == newItem?.id
    }

    override fun areContentsTheSame(oldItem: Advertisement?, newItem: Advertisement?): Boolean {
        return oldItem == newItem
    }
}