package com.example.brusapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.main_recyclerview.*
import kotlinx.android.synthetic.main.result_recyclerview.*

class ResultActivity : AppCompatActivity() {

    private lateinit var resultRecyclerAdapter: ResultRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_recyclerview)

        initRecyclerView()
        updateData()
        initSpinner()
    }

    private fun initSpinner() {
        result_brand_spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, DataSource.resultBrandList)
        result_brand_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                when (parent.getItemAtPosition(position).toString()) {
                    "Alle" -> updateData()
                    Brand.RINGNES.toString() -> updateData(Brand.RINGNES)
                    "Cola" -> updateData(Brand.COLA)
                    "Vann" -> updateData(Brand.VANN)
                    "Molde" -> updateData(Brand.MOLDE)
                    "FirstPrice" -> updateData(Brand.FIRSTPRICE)
                }
                resultRecyclerAdapter.notifyDataSetChanged()
            }
        }
    }


    private fun initRecyclerView() {
        result_recycler_view.apply {
            layoutManager = LinearLayoutManager(this@ResultActivity)
            resultRecyclerAdapter = ResultRecyclerAdapter()
            adapter = resultRecyclerAdapter
            addItemDecoration((DividerItemDecoration(this@ResultActivity,LinearLayoutManager.VERTICAL)))

            val helper = object : ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT) {
                override fun onMove(
                    p0: RecyclerView,
                    p1: RecyclerView.ViewHolder,
                    p2: RecyclerView.ViewHolder
                ): Boolean {
                    return false
                }

                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                    resultRecyclerAdapter.removeAt(viewHolder)
                }

            }
            val itemTouchHelper = ItemTouchHelper(helper)
            itemTouchHelper.attachToRecyclerView(result_recycler_view)
        }
    }

    private fun updateData() {
        val list = DataSource.filterAmount()
        resultRecyclerAdapter.submitList(list)
    }

    private fun updateData(brand: Brand){
        val list = DataSource.filterBrand(brand)
        resultRecyclerAdapter.submitList(DataSource.filterAmount(list))
    }
}
