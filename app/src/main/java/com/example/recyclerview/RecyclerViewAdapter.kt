package com.example.recyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.UserData
import kotlinx.android.synthetic.main.list_items.view.*

class RecyclerViewAdapter(private val dataList: MutableList<UserData> = mutableListOf()) :
    RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.list_items,
            parent, false
        )
        return RecyclerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currentItem =
            dataList[position]  // Instead of Putting "get(position)" we can use "[position]"
        holder.name.text = currentItem.name
        holder.address.text = currentItem.address
        if (position == 0)
            holder.name.setBackgroundColor(Color.RED)
    }

    override fun getItemCount() = dataList.size

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.name
        val address: TextView = itemView.address
    }
}