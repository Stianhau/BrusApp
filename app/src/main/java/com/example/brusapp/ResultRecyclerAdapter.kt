package com.example.brusapp
import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ResultRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var items: ArrayList<Soda> = ArrayList()

    override fun onCreateViewHolder(parrent: ViewGroup, viewType: Int): ResultViewHolder {
        return  ResultViewHolder(LayoutInflater.from(parrent.context).inflate(R.layout.result_recyclerview_row,parrent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ResultViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    fun removeAt(holder: RecyclerView.ViewHolder){
        val position = holder.adapterPosition
        DataSource.list[items[position].index].amount = 0
        items.removeAt(position)
        notifyItemRemoved(position)
        if(items.isEmpty()){
            (holder.itemView.context as Activity).finish()
        }
    }

    fun submitList(mainList:ArrayList<Soda>){
        items = mainList
    }

    class ResultViewHolder(view: View) :RecyclerView.ViewHolder(view){
        private val imgView: ImageView = view.findViewById(R.id.result_img)
        private val textView: TextView = view.findViewById(R.id.result_amount)

        fun bind(soda: Soda){
            imgView.setImageResource(soda.imgID)
            textView.text = soda.amount.toString()
        }
    }


}
