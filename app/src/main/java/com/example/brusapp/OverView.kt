package com.example.brusapp

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.overview.*

class  OverView : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.overview)

        val slist = SodaTypes()
        val idList = slist.imageID
        var value = intent.getIntegerArrayListExtra("values")
        var txtList = arrayListOf<TextView>()
        val imgList = arrayListOf<ImageView>()


        var last = slist.imageIdList.size-1
        for (i in 0..last){
            if(value[i]!=0){
                val iv = ImageView(this)
                iv.id = View.generateViewId()
                iv.setImageResource(idList[i])
                iv.layoutParams = LinearLayout.LayoutParams(250,300)
                potet.addView(iv)
                imgList.add(iv)

                val textView = TextView(this)
                textView.text = value[i].toString()
                textView.textSize = 40F
                textView.id = View.generateViewId()
                potet.addView(textView)
                txtList.add(textView)
            }

        }
        last = txtList.size-1
        val const = ConstraintSet()
        const.clone(potet)
        var temp: ImageView? = null
        var first = true
        for(i in 0..last){
            if(first){
                first = false
                const.connect(imgList[i].id,ConstraintSet.LEFT,ConstraintSet.PARENT_ID,ConstraintSet.LEFT)
                const.connect(imgList[i].id,ConstraintSet.TOP,ConstraintSet.PARENT_ID,ConstraintSet.TOP,10)
                temp = imgList[i]
            }else{
                if (temp != null) {
                    const.connect(imgList[i].id,ConstraintSet.TOP, temp.id,ConstraintSet.BOTTOM,10)
                }
                const.connect(imgList[i].id,ConstraintSet.LEFT,ConstraintSet.PARENT_ID,ConstraintSet.LEFT)
                temp = imgList[i]
            }
            const.applyTo(potet)
            const.connect(txtList[i].id,ConstraintSet.LEFT,temp.id,ConstraintSet.RIGHT,200)
            const.connect(txtList[i].id,ConstraintSet.BOTTOM,temp.id,ConstraintSet.BOTTOM)
            const.connect(txtList[i].id,ConstraintSet.TOP,temp.id,ConstraintSet.TOP)
            const.applyTo(potet)

        }
    }

}
