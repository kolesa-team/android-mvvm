package kz.kolesa.mvvm.advertisements.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kz.kolesa.mvvm.R
import kz.kolesa.mvvm.domain.Advertisement

/**
 * @author marshal@kolesa.kz
 */
class AdvertismentViewHolder(
        itemView: View
) : RecyclerView.ViewHolder(itemView) {

    private val titleView: TextView = itemView.findViewById(R.id.title)
    private val imageView: ImageView = itemView.findViewById(R.id.image)
    private val priceView: TextView = itemView.findViewById(R.id.price)

    fun bindTo(advertisement: Advertisement) {
        titleView.text = advertisement.title
        priceView.text = advertisement.price
    }
}