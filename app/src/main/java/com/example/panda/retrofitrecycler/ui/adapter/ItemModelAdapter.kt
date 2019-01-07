package com.example.panda.retrofitrecycler.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.panda.retrofitrecycler.model.ItemModel
import com.example.panda.retrofitrecycler.R
import com.example.panda.retrofitrecycler.ui.view.ItemModelViewHolder

import java.util.ArrayList

class ItemModelAdapter : RecyclerView.Adapter<ItemModelViewHolder>() {

    private val items = ArrayList<ItemModel>()

    fun setData(newItems: List<ItemModel>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemModelViewHolder, position: Int){
        val itemModel = items.get(position)

        val item = holder as ItemModelViewHolder

        item.itemAdress.text = itemModel.address
        item.itemName.text = itemModel.name
        item.itemCordinates.text = itemModel.coordinates
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemModelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)

        return ItemModelViewHolder(view)
    }
}