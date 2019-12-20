package com.example.brusapp

class DataSource {
    companion object{
        val list = ArrayList<Soda>()

        fun createDataSet(){
            list.clear()
            list.add(Soda( R.drawable.fanta,0, list.size))
            list.add(Soda(R.drawable.mozel,0, list.size))
            list.add(Soda(R.drawable.fantalemon,0, list.size))
            list.add(Soda(R.drawable.fpcolaf,0, list.size))
            list.add(Soda(R.drawable.fpfantaf,0, list.size))
            list.add(Soda(R.drawable.mozelf,0, list.size))
            list.add(Soda(R.drawable.sprite,0, list.size))
            list.add(Soda(R.drawable.villa,0, list.size))
            list.add(Soda(0,0,0))
        }
    }
}