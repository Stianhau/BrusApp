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

    private lateinit var brandSpinnerAdapter: ArrayAdapter<CharSequence>
    override fun onBackPressed() {

    }

    override fun onRestart() {
        super.onRestart()
        mainRecyclerAdapter.submitList(DataSource.filterBrand())
        mainRecyclerAdapter.notifyDataSetChanged()

        main_brand_spinner.setSelection(0)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_recyclerview)

        initRecyclerView()
        addDataSet()
        initSpinners()

        c_button.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
    private fun initSpinners(){
        brandSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,DataSource.brandList)
        main_brand_spinner.adapter = brandSpinnerAdapter
        main_brand_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                when(parent.getItemAtPosition(position).toString()){
                    Brand.ALLE.name -> mainRecyclerAdapter.submitList(DataSource.filterBrand())

                    else -> {
                        val temp = parent.getItemAtPosition(position).toString()
                        mainRecyclerAdapter.submitList(DataSource.filterBrand(Brand.valueOf(temp)))
                    }
                }

                mainRecyclerAdapter.notifyDataSetChanged()
            }
        }
    }

    private fun addDataSet() {
        DataSource.createDataSet()
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

    override fun onIncButtonClicked(drinkable: Drinkable) {
        drinkable.amount++
        mainRecyclerAdapter.notifyItemChanged(drinkable.currindex)
    }

    override fun onDecButtonClicked(drinkable: Drinkable) {
        if(drinkable.amount != 0){
            drinkable.amount--
            mainRecyclerAdapter.notifyItemChanged(drinkable.currindex)
        }
    }
}
