package com.example.brusapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.*
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_soda_owerview.*

class SodaOwerview : AppCompatActivity() {
    private val sodaTypes = SodaTypes()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val sodaList: ArrayList<SodaTypes.Soda> = intent.getSerializableExtra("sodaList") as ArrayList<SodaTypes.Soda>
        var value = intent.getIntegerArrayListExtra("values")
        val temp = arrayListOf<Int>()
        val slist = arrayListOf<SodaTypes.Soda>()
        for (i in 0..sodaTypes.sodaList.size-1){
            if(value[i]!=0){
                slist.add(SodaTypes.Soda(sodaTypes.sodaList[i].imgResource,value[i]))
            }
        }


        setContentView(R.layout.activity_soda_owerview)
        recycler_view!!.layoutManager = LinearLayoutManager(applicationContext)

        recycler_view!!.itemAnimator = DefaultItemAnimator()
        recycler_view!!.addItemDecoration((DividerItemDecoration(this,LinearLayoutManager.VERTICAL)))

        val adapter = SodaAdapter(slist)
        recycler_view!!.adapter = adapter




    }
}
