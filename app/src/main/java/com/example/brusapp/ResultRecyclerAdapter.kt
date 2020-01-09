package com.example.brusapp
import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ResultRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var items: ArrayList<Drinkable> = ArrayList()

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


    fun removeAt(holder: RecyclerView.ViewHolder) : Brand{
        val position = holder.adapterPosition
        val drinkable = items[position]
        DataSource.list[drinkable.index].amount = 0
        items.removeAt(position)
        notifyItemRemoved(position)

        var amount = DataSource.amountOfEachBrand[drinkable.brand]!!
        amount--
        DataSource.amountOfEachBrand[drinkable.brand] = amount
        if(amount == 0){
            DataSource.resultBrandList.remove(drinkable.brand.name)
            DataSource.amountOfEachBrand.remove(drinkable.brand)

        }
        return drinkable.brand
        /*if(items.isEmpty()){
            (holder.itemView.context as Activity).finish()
        }*/

    }

    fun submitList(mainList:ArrayList<Drinkable>){
        items = mainList
    }

    class ResultViewHolder(view: View) :RecyclerView.ViewHolder(view){
        private val imgView: ImageView = view.findViewById(R.id.result_img)
        private val textView: TextView = view.findViewById(R.id.result_amount)

        fun bind(drinkable: Drinkable){
            imgView.setImageResource(drinkable.imgID)
            textView.text = drinkable.amount.toString()
        }
    }


}
