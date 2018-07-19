package kz.kolesa.mvvm.advertisements.adapter

import android.support.v7.recyclerview.extensions.ListAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import kz.kolesa.mvvm.R
import kz.kolesa.mvvm.domain.Advertisement

/**
 * @author marshal@kolesa.kz
 */
class AdvertisementAdapter(
        private val callback: ((Advertisement) -> Unit)?
) : ListAdapter<Advertisement, AdvertisementViewHolder>(
        AdvertisementDiffUtil
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdvertisementViewHolder {
        return LayoutInflater
                .from(parent.context)
                .inflate(R.layout.layout_item_advertisement, parent, false)
                .let { view -> AdvertisementViewHolder(view) }
    }

    override fun onBindViewHolder(holder: AdvertisementViewHolder, position: Int) {
        val advertisement = getItem(position)
        holder.apply {
            itemView.setOnClickListener { callback?.invoke(advertisement) }
            bindTo(advertisement)
        }
    }
}