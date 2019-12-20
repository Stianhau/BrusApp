package com.example.brusapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_recyclerview.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainRecyclerAdapter: MainRecyclerAdapter

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
            mainRecyclerAdapter = MainRecyclerAdapter()
            adapter = mainRecyclerAdapter
            addItemDecoration((DividerItemDecoration(this@MainActivity,LinearLayoutManager.VERTICAL)))
        }
    }
//    var values = arrayListOf<Int>()
//    var txtList = arrayListOf<TextView>()
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if(requestCode == 1){
//            if(resultCode == Activity.RESULT_OK){
//                values = data!!.getIntegerArrayListExtra("values")
//               for(i in 0..values.size-1){
//                   txtList[i].text = values[i].toString()
//               }
//            }
//        }
//    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val sodaList = SodaTypes()
//        var sList = sodaList.imageIdList
//        SodaTypes.createDataSet()
//        SodaTypes.setValue(2,0)
//
//        var list = arrayListOf<ImageView>()
//        var plsList = arrayListOf<Button>()
//        var minList = arrayListOf<Button>()
//
//
//        val last = sList.size-1
//
//
//        for(i in 0..last){
//            values.add(0)
//            val iv = ImageView(this)
//            iv.id = View.generateViewId()
//            iv.setImageResource(sList[i])
//            iv.layoutParams = LinearLayout.LayoutParams(250,300)
//            test.addView(iv)
//            list.add(iv)
//
//            val mButn = Button(this)
//            val pButn = Button(this)
//            val tView = TextView(this)
//            mButn.id = View.generateViewId()
//            pButn.id = View.generateViewId()
//            tView.id = View.generateViewId()
//            mButn.text = "-"
//            pButn.text = "+"
//            tView.text = "0"
//
//            plsList.add(pButn)
//            minList.add(mButn)
//            txtList.add(tView)
//
//            mButn.setOnClickListener {
//
//                if(values[i]>0){
//                    --values[i]
//
//                    txtList[i].text = values[i].toString()
//                }else txtList[i].text = "0"
//            }
//            pButn.setOnClickListener {
//                ++values[i]
//                txtList[i].text = values[i].toString()
//            }
//
//            test.addView(pButn)
//            test.addView(mButn)
//            test.addView(tView)
//        }
//
//
//        var temp: ImageView = list[0]
//        var first = true
//
//        val confButtn = Button(this)
//        confButtn.id = View.generateViewId()
//        confButtn.text = "Confirm"
//        confButtn.setOnClickListener {
//            val intent = Intent(this,SodaOwerview::class.java)
//            intent.putExtra("values",values)
//            startActivityForResult(intent,1)
//        }
//        test.addView(confButtn)
//
//        val const = ConstraintSet()
//        const.clone(test)
//
//        for(i in 0..last){
//            if(first){
//                first = false
//                const.connect(list[i].id,ConstraintSet.LEFT,ConstraintSet.PARENT_ID,ConstraintSet.LEFT)
//                const.connect(list[i].id,ConstraintSet.TOP,ConstraintSet.PARENT_ID,ConstraintSet.TOP,10)
//
//            }else{
//                const.connect(list[i].id,ConstraintSet.LEFT,ConstraintSet.PARENT_ID,ConstraintSet.LEFT)
//                const.connect(list[i].id,ConstraintSet.TOP,temp.id,ConstraintSet.BOTTOM,10)
//                temp = list[i]
//            }
//            const.connect(minList[i].id,ConstraintSet.LEFT,list[i].id,ConstraintSet.RIGHT)
//            const.connect(minList[i].id,ConstraintSet.TOP,list[i].id,ConstraintSet.TOP)
//            const.connect(minList[i].id,ConstraintSet.BOTTOM,list[i].id,ConstraintSet.BOTTOM)
//
//            const.connect(txtList[i].id,ConstraintSet.LEFT,minList[i].id,ConstraintSet.RIGHT,50)
//            const.connect(txtList[i].id,ConstraintSet.TOP,list[i].id,ConstraintSet.TOP)
//            const.connect(txtList[i].id,ConstraintSet.BOTTOM,list[i].id,ConstraintSet.BOTTOM)
//
//            const.connect(plsList[i].id,ConstraintSet.LEFT,txtList[i].id,ConstraintSet.RIGHT,50)
//            const.connect(plsList[i].id,ConstraintSet.TOP,list[i].id,ConstraintSet.TOP)
//            const.connect(plsList[i].id,ConstraintSet.BOTTOM,list[i].id,ConstraintSet.BOTTOM)
//
//            const.applyTo(test)
//        }
//        const.connect(confButtn.id,ConstraintSet.TOP,list[last].id,ConstraintSet.BOTTOM)
//        const.connect(confButtn.id,ConstraintSet.LEFT,ConstraintSet.PARENT_ID,ConstraintSet.LEFT)
//        const.connect(confButtn.id,ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT)
//        const.applyTo(test)
//    }

}
