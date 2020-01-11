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
    private lateinit var typeSpinnerAdapter: ArrayAdapter<CharSequence>
    private lateinit var brandList: ArrayList<CharSequence>
    private lateinit var typeList: ArrayList<CharSequence>


    override fun onBackPressed() {

    }

    override fun onRestart() {
        super.onRestart()
        mainRecyclerAdapter.submitList(DataSource.filterBrand())
        mainRecyclerAdapter.notifyDataSetChanged()
        main_brand_spinner.setSelection(0)
        main_type_spinner.setSelection(0)
        DataSource.updateBrandTypePairs()

        typeSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,typeList)
        brandSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,brandList)
        main_type_spinner.adapter = typeSpinnerAdapter
        main_brand_spinner.adapter = brandSpinnerAdapter
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
        initBrand()
        initType()
    }
    private fun initType(){
        //typeSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,DataSource.typeList)

        typeSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,typeList)
        main_type_spinner.adapter = typeSpinnerAdapter
        main_type_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                val temp = parent.getItemAtPosition(position).toString()
                brandSpinnerAdapter = ArrayAdapter(this@MainActivity,android.R.layout.simple_spinner_item,DataSource.updateBrandSpinner(Type.valueOf(temp)))
                main_brand_spinner.adapter = brandSpinnerAdapter

                mainRecyclerAdapter.submitList(DataSource.filter(Type.valueOf(temp),Brand.valueOf(main_brand_spinner.selectedItem.toString())))
                mainRecyclerAdapter.notifyDataSetChanged()
            }

        }
    }
    private fun initBrand(){
        brandSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,brandList)
        brandSpinnerAdapter.setNotifyOnChange(true)
        main_brand_spinner.adapter = brandSpinnerAdapter
        main_brand_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                val temp = parent.getItemAtPosition(position).toString()
                mainRecyclerAdapter.submitList(DataSource.filter(Type.valueOf(main_type_spinner.selectedItem.toString()),Brand.valueOf(temp)))
                mainRecyclerAdapter.notifyDataSetChanged()
            }
        }
    }


    private fun addDataSet() {
        DataSource.createDataSet()
        DataSource.updateBrandTypePairs()
        brandList = DataSource.updateBrandSpinner(Type.TYPE)
        typeList = DataSource.updateTypeSpinner()
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


