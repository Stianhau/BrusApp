package com.example.brusapp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.*
import android.support.v7.widget.helper.ItemTouchHelper
import android.util.Log
import android.widget.Button
import android.widget.SimpleAdapter
import kotlinx.android.synthetic.main.activity_soda_owerview.*

class SodaOwerview : AppCompatActivity() {

    private val sodaTypes = SodaTypes()
    val values = arrayListOf<Int>()
    override fun onBackPressed() {
        val intnt = Intent()
        intnt.putExtra("values",values)
        setResult(Activity.RESULT_OK,intnt)
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        var value = intent.getIntegerArrayListExtra("values")
        val slist = arrayListOf<SodaTypes.Soda>()
        for (i in 0..sodaTypes.imageIdList.size-1){
            values.add(value[i])
            if(value[i]!=0){
                slist.add(SodaTypes.Soda(sodaTypes.imageIdList[i],value[i],i))
            }
        }


        setContentView(R.layout.activity_soda_owerview)
        recycler_view!!.layoutManager = LinearLayoutManager(applicationContext)



        recycler_view!!.itemAnimator = DefaultItemAnimator()
        recycler_view!!.addItemDecoration((DividerItemDecoration(this,LinearLayoutManager.VERTICAL)))

        val adapter = SodaAdapter(slist)

        recycler_view!!.adapter = adapter

        val swipeHandler = object : SwipeToDeleteCallback(this){
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position:Int = viewHolder.adapterPosition
                values[slist[position].id]=0
                adapter.removeAt(position)
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeHandler)
        itemTouchHelper.attachToRecyclerView(recycler_view)


    }
}
