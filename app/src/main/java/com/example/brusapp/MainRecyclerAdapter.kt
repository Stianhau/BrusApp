package com.example.brusapp
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_recyclerview_row.view.*
import kotlinx.android.synthetic.main.main_recyclerview_row_conf.view.*

class MainRecyclerAdapter(val itemClickListener: OnItemClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<Soda> = ArrayList()
    override fun onCreateViewHolder(parrent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            TYPE_MAIN -> {
                MainViewHolder(LayoutInflater.from(parrent.context).inflate(R.layout.main_recyclerview_row,parrent,false))
            }
            TYPE_CONF -> {
                ConfirmViewHolder(LayoutInflater.from(parrent.context).inflate(R.layout.main_recyclerview_row_conf,parrent,false))
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }


    override fun getItemViewType(position: Int): Int {
        if(position == items.size-1){
            return TYPE_CONF
        }
        return TYPE_MAIN
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is MainViewHolder -> {
                holder.bind(items[position],itemClickListener)
            }
            is ConfirmViewHolder ->{
                holder.bind("Confirm",itemClickListener)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(mainList:List<Soda>){
        items = mainList
    }

    class ConfirmViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        private val confButton = view.conf_button

        fun bind(txt:String, clickListener: OnItemClickListener){
            confButton.text = txt
            itemView.conf_button.setOnClickListener { clickListener.onConfButtonClicked() }

            /* confButton.setOnClickListener {
                val myIntent = Intent(super.itemView.context, ResultActivity::class.java)
                startActivity(super.itemView.context,myIntent,null)
            }*/
        }
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val incButton = itemView.inc_button
        private val decButton = itemView.dec_button
        private val textView = itemView.textView_amount
        private val imageView = itemView.imageView

        fun bind(soda:Soda, clickListener: OnItemClickListener) {
            incButton.text = "+"
            decButton.text = "-"
            textView.text = soda.amount.toString()
            imageView.setImageResource(soda.imgID)
            itemView.inc_button.setOnClickListener { clickListener.onIncButtonClicked(soda) }
            itemView.dec_button.setOnClickListener { clickListener.onDecButtonClicked(soda) }
        }
    }
    companion object{
        private const val TYPE_MAIN = 0
        private const val TYPE_CONF = 1
    }
}
interface OnItemClickListener{
    fun onIncButtonClicked(soda: Soda)
    fun onDecButtonClicked(soda: Soda)
    fun onConfButtonClicked()
}


