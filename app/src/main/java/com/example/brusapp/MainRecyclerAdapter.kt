package com.example.brusapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_recyclerview_row.view.*

class MainRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    var items: List<Soda> = ArrayList()
    override fun onCreateViewHolder(parrent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MainViewHolder(LayoutInflater.from(parrent.context).inflate(R.layout.main_recyclerview_row,parrent,false))
    }



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is MainViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(mainList:List<Soda>){
        items = mainList
    }

    class MainViewHolder(var view:View) : RecyclerView.ViewHolder(view){
        val incButton = view.inc_button
        val decButton = view.dec_button
        val textView = view.textView_amount
        val imageView = view.imageView

        fun bind(soda:Soda){
            incButton.text = "+"
            decButton.text = "-"
            textView.text = soda.amount.toString()
            imageView.setImageResource(soda.imgID)

            incButton.setOnClickListener {
                DataSource.list[soda.index].amount++
                textView.text = DataSource.list[soda.index].amount.toString()
            }
            decButton.setOnClickListener {
                if(DataSource.list[soda.index].amount != 0){
                    DataSource.list[soda.index].amount--
                    textView.text = DataSource.list[soda.index].amount.toString()
                }
            }
        }
    }

}

