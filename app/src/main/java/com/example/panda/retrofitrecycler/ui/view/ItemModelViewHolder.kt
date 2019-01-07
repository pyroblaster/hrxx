package com.example.panda.retrofitrecycler.ui.view

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.panda.retrofitrecycler.R
import com.example.panda.retrofitrecycler.model.ItemModel
import kotlinx.android.synthetic.main.item_layout.view.*



class ItemModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var itemAdress = itemView.address
    var itemName = itemView.name
    var itemCordinates = itemView.coordinates

    private lateinit var itemModel: ItemModel
    private lateinit var activity: Activity

    fun setItemModel(itemModel: ItemModel){
        this.itemModel = itemModel
        setItem()
    }

    fun setActivity(activity: Activity) {
        this.activity = activity
    }

    fun setItem() {
        itemAdress.text = itemModel.address
        itemName.text = itemModel.name
        itemCordinates.text = itemModel.coordinates
    }

}