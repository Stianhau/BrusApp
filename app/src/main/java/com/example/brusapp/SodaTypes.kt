package com.example.brusapp

import java.text.FieldPosition

class SodaTypes{
    data class Soda(var imgResource: Int,var value:Int){}


    var sodaList = arrayListOf<Soda>()
    var imageID = arrayListOf<Int>()
    var imageIdList = arrayOf<Int>(
        R.drawable.fanta,
        R.drawable.cola,
        R.drawable.mozel,
        R.drawable.fantalemon,
        R.drawable.fpcolaf,
        R.drawable.fpfantaf,
        R.drawable.mozelf,
        R.drawable.sprite,
        R.drawable.villa
    )

    constructor(){
        val size: Int = imageIdList.size-1
        for (i in 0..size){
            sodaList.add(Soda(imageIdList[i],0))
            imageID.add(imageIdList[i])
        }
    }
    fun remove(position: Int){
        sodaList.removeAt(position)
    }
}