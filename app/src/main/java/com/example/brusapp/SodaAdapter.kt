package com.example.brusapp
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class SodaAdapter(val sodaList: ArrayList<SodaTypes.Soda>) : RecyclerView.Adapter<SodaAdapter.MyViewHolder>(){
    class MyViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val imgView: ImageView = view.findViewById(R.id.img_soda)
        val textView: TextView = view.findViewById(R.id.value)

        fun bindItems(item: SodaTypes.Soda){
            val value : Int = item.value
                imgView.setImageResource(item.imgResource)
                textView.text = value.toString()


        }
    }

    override fun onCreateViewHolder(parrent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parrent.context).inflate(R.layout.soda_list_row,parrent,false)
        return  MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sodaList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(sodaList[position])
    }

}
