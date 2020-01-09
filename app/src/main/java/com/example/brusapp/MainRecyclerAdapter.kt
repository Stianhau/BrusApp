package com.example.brusapp
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_recyclerview_row.view.*

class MainRecyclerAdapter(private val itemClickListener: OnItemClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<Drinkable> = ArrayList()
    override fun onCreateViewHolder(parrent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            TYPE_MAIN -> {
                MainViewHolder(LayoutInflater.from(parrent.context).inflate(R.layout.main_recyclerview_row,parrent,false))
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }


    override fun getItemViewType(position: Int): Int {
        return TYPE_MAIN
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is MainViewHolder -> {
                holder.bind(items[position],itemClickListener)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(mainList:List<Drinkable>){
        items = mainList
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val incButton = itemView.i_button
        private val decButton = itemView.d_button
        private val textView = itemView.t_view
        private val imageView = itemView.i_view

        fun bind(drinkable:Drinkable, clickListener: OnItemClickListener) {
            incButton.text = "+"
            decButton.text = "-"
            textView.text = drinkable.amount.toString()
            imageView.setImageResource(drinkable.imgID)
            itemView.i_button.setOnClickListener { clickListener.onIncButtonClicked(drinkable) }
            itemView.d_button.setOnClickListener { clickListener.onDecButtonClicked(drinkable) }
        }
    }
    companion object{
        private const val TYPE_MAIN = 0
    }
}
interface OnItemClickListener{
    fun onIncButtonClicked(drinkable: Drinkable)
    fun onDecButtonClicked(drinkable: Drinkable)
}


