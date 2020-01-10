package com.example.brusapp

import android.icu.util.CurrencyAmount

class DataSource {
    companion object{
        val list = ArrayList<Drinkable>()
        val typeList = ArrayList<CharSequence>()
        val brandList = ArrayList<CharSequence>()

        val amountOfEachBrand = HashMap<Brand,Int>()
        val resultBrandList = ArrayList<CharSequence>()

        val brandTypepair = HashMap<Type,HashMap<Brand,Int>>()

        fun createDataSet(){
            list.clear()
            list.add(Drinkable(R.drawable.spritef, 0, list.size, Brand.COLA,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.sprite, 0, list.size, Brand.COLA,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fantalemon, 0, list.size, Brand.COLA,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.colalemon, 0, list.size, Brand.COLA,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fantaexotic, 0, list.size, Brand.COLA,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fantafree, 0, list.size, Brand.COLA,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpfantaf, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpvillaf, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.peref, 0, list.size, Brand.MOLDE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.sitron, 0, list.size, Brand.MOLDE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.bring, 0, list.size, Brand.MOLDE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.pere, 0, list.size, Brand.MOLDE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpcola, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpcolaf, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpfanta, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.upf, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.up, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.solosup, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.solor, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.colalight, 0, list.size, Brand.COLA,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.mozel, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.mozelf, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.villaf, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.inge, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.eventyr, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.pepsi, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.pepsilemon, 0, list.size, Brand.RINGNES,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.fpvilla, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpvannk, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpvann, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.isapelsin, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.islime, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.issitron, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.isvann, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.isvannk, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.iseple, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.isgranat, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.bobleeple, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.boblesitron, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.boblevann, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.boblegranat, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.ASKO))
            list.add(Drinkable(R.drawable.farrisgul, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.farrisgronn, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.farrisvann, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisrosa, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisrod, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisgronn, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisblo, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisorange, 0, list.size, Brand.VANN,list.size,Type.STOR,Supplier.RINGNES))

            list.add(Drinkable(R.drawable.hansa365, 0, list.size, Brand.COLA,list.size,Type.VANLIG,Supplier.ASKO))

            list.add(Drinkable(R.drawable.cola05, 0, list.size, Brand.COLA,list.size,Type.LITEN,Supplier.ASKO))
            list.add(Drinkable(R.drawable.mozel, 0, list.size, Brand.RINGNES,list.size,Type.LITEN,Supplier.RINGNES))



            list.add(Drinkable(R.drawable.noccper, 0, list.size, Brand.COLA,list.size,Type.NOCCO,Supplier.ASKO))

            list.add(Drinkable(R.drawable.redbull05, 0, list.size, Brand.COLA,list.size,Type.ENERGI,Supplier.ASKO))
            list.add(Drinkable(R.drawable.redbull02, 0, list.size, Brand.COLA,list.size,Type.ENERGI,Supplier.ASKO))
            list.add(Drinkable(R.drawable.batteryorig, 0, list.size, Brand.RINGNES,list.size,Type.ENERGI,Supplier.RINGNES))

            list.add(Drinkable(R.drawable.crabbies, 0, list.size, Brand.COLA,list.size,Type.SPESIAL,Supplier.ASKO))


            list.add(Drinkable(R.drawable.munkbay05, 0, list.size, Brand.MUNKHOLM,list.size,Type.ALKOFRI,Supplier.ASKO))
            list.add(Drinkable(R.drawable.munkfat05, 0, list.size, Brand.MUNKHOLM,list.size,Type.ALKOFRI,Supplier.ASKO))
            list.add(Drinkable(R.drawable.munkorg05, 0, list.size, Brand.MUNKHOLM,list.size,Type.ALKOFRI,Supplier.ASKO))

            Brand.values().forEach {
                brandList.add(it.name)
            }

            Type.values().forEach {
                typeList.add(it.name)
            }
        }
        private fun updateCurrentIndex(){
            for(item in list){
                item.currindex = item.index
            }
        }

        fun updateBrandTypePairs(){
            updateBrandTypePairs(list)
        }
        fun updateBrandTypePairs(fList: ArrayList<Drinkable>){
            brandTypepair.clear()
            val merke = HashMap<Brand,Int>()

            for(item in fList){
                if(!brandTypepair.containsKey(item.type)){
                    val temp = HashMap<Brand,Int>()
                    temp[item.brand] = 1
                    brandTypepair[item.type] = temp

                }else{
                    if(!brandTypepair[item.type]!!.contains(item.brand)){
                        brandTypepair[item.type]!![item.brand] = 1

                    }else{
                        brandTypepair[item.type]!![item.brand]!!.plus(1)
                        //temp!!.plus(1)
                    }
                }
                merke[item.brand] = 1

            }
            brandTypepair[Type.TYPE] = merke
        }
        fun getBrandTypePair(type: Type) :ArrayList<CharSequence>{
            val temp = ArrayList<CharSequence>()
            temp.add(Brand.MERKE.name)
            val map = brandTypepair[type]
            if (map != null) {
                for((k,v) in map){
                    temp.add(k.name)
                }
            }
            return temp
        }
        fun updateTypeSpinner():ArrayList<CharSequence>{
            val temp = ArrayList<CharSequence>()
            temp.add(Type.TYPE.name)
            for((k,v) in brandTypepair){
                if(k != Type.TYPE) temp.add(k.name)
            }
            return temp
        }



        //TYPE, STOR, LITEN, SPESIAL, VANLIG, ENERGI, NOCCO, ALKOFRI
        fun updateBrandSpinner(type: Type): ArrayList<CharSequence>{
            val temp = ArrayList<CharSequence>()
            return getBrandTypePair(type)
           /* when(type){
                Type.TYPE -> return brandList
                else -> {

                }*/
                /*Type.ENERGI -> {
                    temp.add(Brand.MERKE.name)
                }
                Type.STOR -> {
                    temp.add(Brand.MERKE.name)
                    temp.add(Brand.COLA.name)
                    temp.add(Brand.RINGNES.name)
                    temp.add(Brand.MOLDE.name)
                    temp.add(Brand.VANN.name)
                    temp.add(Brand.FIRSTPRICE.name)
                }
                Type.LITEN -> {
                    temp.add(Brand.MERKE.name)
                }
                Type.SPESIAL ->{
                    temp.add(Brand.MERKE.name)
                }
                Type.VANLIG -> {
                    temp.add(Brand.MERKE.name)
                    temp.add(Brand.HANSA.name)

                }

                Type.ALKOFRI -> {
                    temp.add(Brand.MERKE.name)
                    temp.add(Brand.MUNKHOLM.name)
                }
                Type.NOCCO -> {
                    temp.add(Brand.MERKE.name)
                }*/

            //}
           // return temp
        }
        fun filterBrand(brand: Brand):ArrayList<Drinkable>{
                if(brand == Brand.MERKE){
                    return filterBrand()
                }
                val filterList = ArrayList<Drinkable>()
                for(item in list){
                    if(item.brand == brand){
                        item.currindex = filterList.size
                        filterList.add(item)
                    }
                }
                return filterList
        }

        fun filterBrand():ArrayList<Drinkable>{
            updateCurrentIndex()
            return list
        }

        fun filterAmount() :ArrayList<Drinkable> {
            amountOfEachBrand.clear()
            resultBrandList.clear()
            resultBrandList.add(Brand.MERKE.name)
            val filterList = ArrayList<Drinkable>()
            for(item in list){
                if(item.amount != 0){
                    if(!amountOfEachBrand.containsKey(item.brand)){
                        amountOfEachBrand[item.brand] = 1
                        resultBrandList.add(item.brand.name)
                        filterList.add(item)
                    }else{
                        val temp = 1 + amountOfEachBrand[item.brand]!!
                        amountOfEachBrand[item.brand] = temp
                        filterList.add(item)
                    }
                }
            }
            return filterList
        }

        fun filterAmount(resultList: ArrayList<Drinkable>) :ArrayList<Drinkable>{
            val filterList = ArrayList<Drinkable>()
            for(item in resultList){
                if(item.amount != 0){
                    filterList.add(item)
                }
            }
            return filterList
        }
        fun filterType(type: Type): ArrayList<Drinkable>{
            val filterList = ArrayList<Drinkable>()

            return filterList
        }
        fun filterType(type: Type, brand: Brand): ArrayList<Drinkable> {
            val filterList = ArrayList<Drinkable>()
            val tempList = filterBrand(brand)
            for(item in tempList){
                if(item.type == type){
                    filterList.add(item)
                }
            }
            return filterList
        }

        private fun filterType(): ArrayList<Drinkable> {
            return filterBrand()
        }


        fun filterBrand(brand: Brand,fList:ArrayList<Drinkable>): ArrayList<Drinkable>{
            if(brand == Brand.MERKE){
                return fList
            }
            val filterList = ArrayList<Drinkable>()

            for(item in fList){
                if(item.brand == brand){
                    item.currindex = filterList.size
                    filterList.add(item)
                }
            }
            return filterList

        }

        fun filterType(type: Type,fList:ArrayList<Drinkable>): ArrayList<Drinkable>{
            if(type == Type.TYPE){
                return fList
            }
            val filterList = ArrayList<Drinkable>()
            for(item in fList){
                if(item.type == type){
                    item.currindex = filterList.size
                    filterList.add(item)
                }
            }
            return filterList
        }

        fun filter(type: Type, brand: Brand): ArrayList<Drinkable>{
            return filterBrand(brand,filterType(type, list))
        }
        fun filterAmount(type: Type,brand: Brand): ArrayList<Drinkable>{
            return filterAmount(filter(type, brand))
        }
    }
}
enum class Brand{
    MERKE, RINGNES, COLA, VANN, FIRSTPRICE, MOLDE, MUNKHOLM, HANSA, ;

}
enum class Type{
    TYPE, STOR, LITEN, ENERGI, NOCCO, VANLIG, SPESIAL,   ALKOFRI
}

enum class Supplier{
    LEVRANDOR,ASKO,RINGNES
}