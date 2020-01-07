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

        c_button.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
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
                    "Alle" -> mainRecyclerAdapter.submitList(DataSource.sortOnBrand())
                    "Ringnes" -> mainRecyclerAdapter.submitList(DataSource.sortOnBrand(Brand.RINGNES))
                    "Cola" ->  mainRecyclerAdapter.submitList(DataSource.sortOnBrand(Brand.COLA))
                    "Vann" -> mainRecyclerAdapter.submitList(DataSource.sortOnBrand(Brand.VANN))
                    "Molde" -> mainRecyclerAdapter.submitList(DataSource.sortOnBrand(Brand.MOLDE))
                    "FirstPrice" -> mainRecyclerAdapter.submitList(DataSource.sortOnBrand(Brand.FIRSTPRICE))
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
}
