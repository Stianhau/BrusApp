package com.example.brusapp

import android.opengl.Matrix
import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sodaList = SodaList()
        var sList = sodaList.ImageIdList

        var list = arrayListOf<ImageView>()
        var plsList = arrayListOf<Button>()
        var minList = arrayListOf<Button>()
        var txtList = arrayListOf<TextView>()
        var values = arrayListOf<Int>()

        val last = sList.size-1


        for(i in 0..last){
            values.add(0)
            val iv = ImageView(this)

            iv.id = View.generateViewId()
            iv.setImageResource(sList[i])
            iv.layoutParams = LinearLayout.LayoutParams(250,300)
            test.addView(iv)
            list.add(iv)

            val mButn = Button(this)
            val pButn = Button(this)
            val tView = TextView(this)
            mButn.id = View.generateViewId()
            pButn.id = View.generateViewId()
            tView.id = View.generateViewId()
            mButn.text = "-"
            pButn.text = "+"
            tView.text = "0"

            plsList.add(pButn)
            minList.add(mButn)
            txtList.add(tView)

            mButn.setOnClickListener {

                if(values[i]>0){
                    --values[i]
                    txtList[i].text = values[i].toString()
                }else txtList[i].text = "0"
            }
            pButn.setOnClickListener {
                ++values[i]
                txtList[i].text = values[i].toString()
            }

            test.addView(pButn)
            test.addView(mButn)
            test.addView(tView)
        }
        val const = ConstraintSet()
        const.clone(test)

        var temp: ImageView = list[0]
        var first = true


        for(i in 0..last){
            if(first){
                first = false
                const.connect(list[i].id,ConstraintSet.LEFT,ConstraintSet.PARENT_ID,ConstraintSet.LEFT)
                const.connect(list[i].id,ConstraintSet.TOP,ConstraintSet.PARENT_ID,ConstraintSet.TOP,10)

            }else{
                const.connect(list[i].id,ConstraintSet.LEFT,ConstraintSet.PARENT_ID,ConstraintSet.LEFT)
                const.connect(list[i].id,ConstraintSet.TOP,temp.id,ConstraintSet.BOTTOM,10)

                if(i==last){

                }

                temp = list[i]
            }
            const.connect(minList[i].id,ConstraintSet.LEFT,list[i].id,ConstraintSet.RIGHT)
            const.connect(minList[i].id,ConstraintSet.TOP,list[i].id,ConstraintSet.TOP)
            const.connect(minList[i].id,ConstraintSet.BOTTOM,list[i].id,ConstraintSet.BOTTOM)

            const.connect(txtList[i].id,ConstraintSet.LEFT,minList[i].id,ConstraintSet.RIGHT,50)
            const.connect(txtList[i].id,ConstraintSet.TOP,list[i].id,ConstraintSet.TOP)
            const.connect(txtList[i].id,ConstraintSet.BOTTOM,list[i].id,ConstraintSet.BOTTOM)

            const.connect(plsList[i].id,ConstraintSet.LEFT,txtList[i].id,ConstraintSet.RIGHT,50)
            const.connect(plsList[i].id,ConstraintSet.TOP,list[i].id,ConstraintSet.TOP)
            const.connect(plsList[i].id,ConstraintSet.BOTTOM,list[i].id,ConstraintSet.BOTTOM)

            const.applyTo(test)

        }


        //setSupportActionBar(toolbar)
    }
/*
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }*/
}
