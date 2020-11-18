package com.jim.jezi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.jim.jezi.Model.Product
import com.jim.jezi.R

class mainAdapter(private val exampleList:List<Product>):RecyclerView.Adapter<mainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.singlecard,parent,false)
        return MainViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.name.text = currentItem.name
        holder.description.text = currentItem.description
        holder.price.text = currentItem.price
        holder.imageurl.text = currentItem.ImageUrl
    }


    override fun getItemCount() =  exampleList.size

    class MainViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.name)
        val price:TextView = itemView.findViewById(R.id.price)
        val description:TextView = itemView.findViewById(R.id.description)
        val imageurl:TextView = itemView.findViewById(R.id.imageurl)

        }
}