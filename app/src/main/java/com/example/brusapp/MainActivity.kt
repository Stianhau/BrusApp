package com.example.brusapp


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.main_recyclerview.*

class MainActivity : AppCompatActivity(), OnItemClickListener {

    private lateinit var mainRecyclerAdapter: MainRecyclerAdapter
    private val sortList = arrayListOf<Soda>()
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
        initSpinner()


    }
    private fun initSpinner(){
        spin.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,DataSource.brandList)
        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                when(parent.getItemAtPosition(position).toString()){
                    "Alle" -> sortOnBrand()
                    "Ringnes" -> sortOnBrand(Brand.RINGNES)
                    "Cola" -> sortOnBrand(Brand.COLA)
                    "Vann" -> sortOnBrand(Brand.VANN)
                    "Molde" -> sortOnBrand(Brand.MOLDE)
                    "FirstPrice" -> sortOnBrand(Brand.FIRSTPRICE)
                }
                mainRecyclerAdapter.notifyDataSetChanged()
            }

        }
    }
    private fun sortOnBrand(brand: Brand){
        sortList.clear()
        for(item in DataSource.list){
            if(item.brand == brand){
                item.currindex = sortList.size
                sortList.add(item)
            }
        }
        mainRecyclerAdapter.submitList(sortList)

    }
    private fun sortOnBrand(){
        DataSource.updateCurrindex()
        mainRecyclerAdapter.submitList(DataSource.list)

    }

    private fun addDataSet() {
        DataSource.createDataSet()
        //mainRecyclerAdapter.submitList(DataSource.list)
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
        mainRecyclerAdapter.notifyItemChanged(soda.currindex)
    }

    override fun onDecButtonClicked(soda: Soda) {
        if(soda.amount != 0){
            soda.amount--
            mainRecyclerAdapter.notifyItemChanged(soda.currindex)
        }
    }

    override fun onConfButtonClicked() {
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }
}
