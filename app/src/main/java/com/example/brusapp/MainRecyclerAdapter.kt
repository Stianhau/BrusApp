package com.example.brusapp
import android.content.Intent
import android.support.v4.app.ActivityCompat.startActivityForResult
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.main_recyclerview_row.view.*
import kotlinx.android.synthetic.main.main_recyclerview_row_conf.view.*

class MainRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    var items: List<Soda> = ArrayList()
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
                holder.bind(items[position])
            }
            is ConfirmViewHolder ->{
                holder.bind("Confirm")
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(mainList:List<Soda>){
        items = mainList
    }

    class ConfirmViewHolder(var view : View) : RecyclerView.ViewHolder(view) {
        val confButton = view.conf_button

        fun bind(txt:String){
            confButton.text = txt
            confButton.setOnClickListener {

                val myIntent = Intent(super.itemView.context, ResultActivity::class.java)
                startActivity(super.itemView.context,myIntent,null)
            }
        }
    }

    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view){
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
    companion object{
        private const val TYPE_MAIN = 0
        private const val TYPE_CONF = 1
    }

}

