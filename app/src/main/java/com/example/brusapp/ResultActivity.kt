package com.example.brusapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.service.autofill.Dataset
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.util.Log
import android.util.Log.d
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.result_recyclerview.*

class ResultActivity : AppCompatActivity() {
    //todo ONLY SHOW AVAILABLE TYPES
    private lateinit var resultRecyclerAdapter: ResultRecyclerAdapter

    private lateinit var typeSpinnerAdapter: ArrayAdapter<CharSequence>
    private lateinit var brandSpinnerAdapter: ArrayAdapter<CharSequence>
    private lateinit var brandList: ArrayList<CharSequence>
    private lateinit var typeList: ArrayList<CharSequence>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_recyclerview)

        initRecyclerView()
        updateData()
        initSpinners()
    }

    private fun initSpinners() {
        initBrandSpinner()
        initTypeSpinner()

    }

    private fun initBrandSpinner() {
        //brandSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,DataSource.getBrandTypePair(Type.TYPE))
        brandSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,brandList)
        result_brand_spinner.adapter = brandSpinnerAdapter
        result_brand_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                val temp = parent.getItemAtPosition(position).toString()
                resultRecyclerAdapter.submitList(DataSource.filterAmount(Type.valueOf(result_type_spinner.selectedItem.toString()),Brand.valueOf(temp)))
                resultRecyclerAdapter.notifyDataSetChanged()
            }
        }
    }

    private fun initTypeSpinner() {
        typeSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,typeList)
        result_type_spinner.adapter = typeSpinnerAdapter
        result_type_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>) {

            }
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                val temp = parent.getItemAtPosition(position).toString()
                brandSpinnerAdapter = ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateBrandSpinner(Type.valueOf(temp)))
                //brandList = DataSource.updateBrandSpinner(Type.valueOf(temp))

                result_brand_spinner.adapter = brandSpinnerAdapter

                resultRecyclerAdapter.submitList(DataSource.filterAmount(Type.valueOf(temp),Brand.valueOf(result_brand_spinner.selectedItem.toString())))
                resultRecyclerAdapter.notifyDataSetChanged()
                //brandSpinnerAdapter.notifyDataSetChanged()
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
                    val brand = resultRecyclerAdapter.removeAt(viewHolder)
                    val type = resultRecyclerAdapter.getType()
                    d("lul","false")
                    d("lul",DataSource.brandTypepair[Type.TYPE]!![Brand.MERKE].toString())
                    if(resultRecyclerAdapter.removed()) {
                        d("lul", "xDDDDDD")
                        d("lul", DataSource.brandTypepair[Type.TYPE]!![Brand.MERKE].toString())
                        if (DataSource.brandTypepair[Type.TYPE]!![Brand.MERKE] == 0) {
                            finish()
                        }
                        if(Type.valueOf(result_type_spinner.selectedItem.toString())==Type.TYPE){
                            d("lul","kepppa")
                            if( DataSource.brandTypepair[Type.TYPE]!![brand] == 0){
                                d("lul","kepppa2")

                                DataSource.brandTypepair[Type.TYPE]!!.remove(brand)
                                brandSpinnerAdapter = ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateBrandSpinner(Type.TYPE))
                                result_brand_spinner.adapter = brandSpinnerAdapter
                                if(DataSource.brandTypepair[type]!!.size== 1){
                                    DataSource.brandTypepair.remove(type)
                                }
                                typeSpinnerAdapter = ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateTypeSpinner())
                                result_type_spinner.adapter = typeSpinnerAdapter
                            }else if(DataSource.brandTypepair[type]!!.size == 1){
                                d("lul","kepppa3")
                                DataSource.brandTypepair.remove(type)
                                typeSpinnerAdapter = ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateTypeSpinner())
                                result_type_spinner.adapter = typeSpinnerAdapter
                            }
                        }else{
                            d("lul","heisann")
                            brandSpinnerAdapter =ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateBrandSpinner(Type.valueOf(result_type_spinner.selectedItem.toString())))
                            result_brand_spinner.adapter = brandSpinnerAdapter
                            d("lul",DataSource.brandTypepair[Type.valueOf(result_type_spinner.selectedItem.toString())]!!.size.toString())
                            if(DataSource.brandTypepair[Type.valueOf(result_type_spinner.selectedItem.toString())]!!.size == 1){
                                d("lul","heisann2")
                                DataSource.brandTypepair.remove(type)
                                //DataSource.brandTypepair[Type.TYPE]!!.remove(brand)
                                //DataSource.brandTypepair.remove(Type.valueOf(result_type_spinner.selectedItem.toString()))
                                typeSpinnerAdapter = ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateTypeSpinner())
                                result_type_spinner.adapter = typeSpinnerAdapter
                                if(DataSource.brandTypepair[Type.TYPE]!![brand] == 0){
                                    DataSource.brandTypepair[Type.TYPE]!!.remove(brand)
                                    brandSpinnerAdapter =ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateBrandSpinner(Type.valueOf(result_type_spinner.selectedItem.toString())))
                                    result_brand_spinner.adapter = brandSpinnerAdapter
                                }
                            }else if(DataSource.brandTypepair[Type.TYPE]!![brand] == 0){
                                DataSource.brandTypepair[Type.TYPE]!!.remove(brand)
                                brandSpinnerAdapter =ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateBrandSpinner(Type.valueOf(result_type_spinner.selectedItem.toString())))
                                result_brand_spinner.adapter = brandSpinnerAdapter
                            }
                        }
                    }
//                        if(DataSource.brandTypepair[type]!!.size == 0){
//                            DataSource.brandTypepair.remove(type)
//                            if(DataSource.brandTypepair.size == 0){
//                                finish()
//                            }
//                            if(Type.valueOf(result_type_spinner.selectedItem.toString())!=Type.TYPE){
//                                typeSpinnerAdapter = ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateTypeSpinner())
//                                result_type_spinner.adapter = typeSpinnerAdapter
//                            }else{
//
//                            }
//                            if(result_type_spinner.selectedItem.toString() == Type.TYPE.name){
//                                finish()
//                            }else{
//
//                                typeSpinnerAdapter = ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateTypeSpinner())
//                                brandSpinnerAdapter = ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateBrandSpinner(Type.TYPE))
//                                result_brand_spinner.adapter = brandSpinnerAdapter
//                                result_type_spinner.adapter = typeSpinnerAdapter
//                            }
//                        }else{
//                            brandSpinnerAdapter = ArrayAdapter(this@ResultActivity,android.R.layout.simple_spinner_item,DataSource.updateBrandSpinner(Type.valueOf(result_type_spinner.selectedItem.toString())))
//                            result_brand_spinner.adapter = brandSpinnerAdapter
//                        }
//                    }
//                    *//*if(!DataSource.amountOfEachBrand.containsKey(brand)){
//                        //brandSpinnerAdapter.notifyDataSetChanged()
//                        result_brand_spinner.setSelection(0)
//                    }*//*
//                    if(DataSource.amountOfEachBrand.isEmpty()) finish()
                }

            }
            val itemTouchHelper = ItemTouchHelper(helper)
            itemTouchHelper.attachToRecyclerView(result_recycler_view)
        }
    }

    private fun updateData() {
        val list = DataSource.filterAmount()
        if(list.isEmpty()){
            finish()
        }
        DataSource.updateBrandTypePairs(list)
        brandList = DataSource.updateBrandSpinner(Type.TYPE)
        typeList = DataSource.updateTypeSpinner()
        resultRecyclerAdapter.submitList(list)
    }
}
