package com.example.brusapp

class SodaList{

    var ImageIdList = arrayOf<Int>(
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
    var imageID = arrayListOf<Int>()
    constructor(){
        for (i in ImageIdList){
            imageID.add(i)
        }
    }
}