package com.example.brusapp

import java.text.FieldPosition

class SodaTypes{

    data class Soda(var imgResource: Int,var value:Int,var id: Int)

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
    companion object{
        val list = ArrayList<Soda>()
        fun createDataSet(){
            list.add(Soda(R.drawable.fanta,0,0))
        }
        fun setValue(value:Int,index:Int){
            list[index].value=value
        }
    }
}