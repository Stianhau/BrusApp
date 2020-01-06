package com.example.brusapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import kotlinx.android.synthetic.main.result_recyclerview.*

class ResultActivity : AppCompatActivity() {

    private lateinit var resultRecyclerAdapter: ResultRecyclerAdapter
    private val resultList = arrayListOf<Soda>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_recyclerview)

        initRecyclerView()
        addData()
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

    private fun addData() {
        for(item in DataSource.list){
            if(item.amount != 0){
                resultList.add(item)
            }
        }
        resultRecyclerAdapter.submitList(resultList)
    }
}
