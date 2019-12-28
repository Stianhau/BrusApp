package com.example.brusapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.main_recyclerview.*

class MainActivity : AppCompatActivity(), OnItemClickListener {

    private lateinit var mainRecyclerAdapter: MainRecyclerAdapter
    override fun onBackPressed() {

    }

    override fun onRestart() {
        super.onRestart()
        mainRecyclerAdapter.notifyDataSetChanged()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_recyclerview)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        DataSource.createDataSet()
        mainRecyclerAdapter.submitList(DataSource.list)
    }

    private fun initRecyclerView() {
        main_recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            mainRecyclerAdapter = MainRecyclerAdapter(this@MainActivity)
            adapter = mainRecyclerAdapter
            setHasFixedSize(true)
            setItemViewCacheSize(20)
            addItemDecoration((DividerItemDecoration(this@MainActivity,LinearLayoutManager.VERTICAL)))
        }
    }

    override fun onIncButtonClicked(soda: Soda) {
        soda.amount++
        mainRecyclerAdapter.notifyItemChanged(soda.index)
    }

    override fun onDecButtonClicked(soda: Soda) {
        if(soda.amount != 0){
            soda.amount--
            mainRecyclerAdapter.notifyItemChanged(soda.index)
        }
    }

    override fun onConfButtonClicked() {
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }
}
