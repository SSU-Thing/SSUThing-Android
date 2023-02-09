package com.example.ssuthing.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ssuthing.R
import com.example.ssuthing.data.ItemListData

class PatrolPageAdapter(val itemList: ArrayList<ItemListData>) :
    RecyclerView.Adapter<PatrolPageAdapter.BoardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return BoardViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.tv_list_number.text = (position + 1).toString()
        holder.tv_name.text = itemList[position].itemName
        holder.tv_number.text = itemList[position].itemNumber.toString()
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    inner class BoardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tv_list_number = itemView.findViewById<TextView>(R.id.list_number)
        val tv_name = itemView.findViewById<TextView>(R.id.item_name)
        val tv_number = itemView.findViewById<TextView>(R.id.item_number)
    }
}