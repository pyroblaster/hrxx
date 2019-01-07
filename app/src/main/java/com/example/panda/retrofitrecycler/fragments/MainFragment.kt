package com.example.panda.retrofitrecycler.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.panda.retrofitrecycler.R
import com.example.panda.retrofitrecycler.model.ItemModel
import com.example.panda.retrofitrecycler.network.RetrofitUtil
import com.example.panda.retrofitrecycler.ui.adapter.ItemModelAdapter
import com.example.panda.retrofitrecycler.ui.view.ItemModelViewHolder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private val adapter = ItemModelAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        item_recycler_view.adapter = adapter
        item_recycler_view.layoutManager = LinearLayoutManager(activity)

        val items = listOf<ItemModel>()

        adapter.setData(items)
    }

    override fun onStart() {
        super.onStart()

        RetrofitUtil.apiService.getApiData()
            .subscribeOn(Schedulers.io()) //ne treba
            .observeOn(AndroidSchedulers.mainThread()) //ne treba
            .subscribe(adapter::setData, Throwable::printStackTrace) //ne treba
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()

    }
}
