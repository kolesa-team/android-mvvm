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
) : ListAdapter<Advertisement, AdvertismentViewHolder>(
        AdvertisementDiffUtil
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdvertismentViewHolder {
        return LayoutInflater
                .from(parent.context)
                .inflate(R.layout.layout_item_my, parent, false)
                .let { view -> AdvertismentViewHolder(view) }
    }

    override fun onBindViewHolder(holder: AdvertismentViewHolder, position: Int) {
        val advertisement = getItem(position)
        holder.apply {
            itemView.setOnClickListener { callback?.invoke(advertisement) }
            bindTo(advertisement)
        }
    }
}