package kz.kolesa.mvvm.advertisements

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kz.kolesa.mvvm.R
import kz.kolesa.mvvm.advertisements.adapter.AdvertisementAdapter

class AdvertisementListFragment : Fragment() {

    private lateinit var mAdvertisementViewModel: AdvertisementViewModel
    private lateinit var advertisementAdapter: AdvertisementAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        advertisementAdapter = AdvertisementAdapter { advertisement ->
            mAdvertisementViewModel.onAdvertClicked(advertisement)
        }
        view.findViewById<RecyclerView>(R.id.recycler_view).apply {
            this.adapter = advertisementAdapter
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mAdvertisementViewModel = createViewModel()
        /*
        mAdvertisementViewModel.onStart()
        mAdvertisementViewModel.getAdvertisementLiveData().observe(this, Observer { advertisements->
            advertisementAdapter.submitList(advertisements)
        })
        */
    }

    private fun createViewModel(): AdvertisementViewModel {
        /*
        val myViewModelFactory = MyViewModelFactory()
        val advertisementViewModel = ViewModelProviders.of(
                this, myViewModelFactory
        ).get(AdvertisementViewModel::class.java)

        return advertisementViewModel
        */
    }
}