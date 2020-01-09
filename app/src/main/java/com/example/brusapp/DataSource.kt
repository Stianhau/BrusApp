package com.example.brusapp

class DataSource {
    companion object{
        val list = ArrayList<Drinkable>()

        val resultBrandList = ArrayList<CharSequence>()

        val brandList = ArrayList<CharSequence>()
        val amountOfEachBrand = HashMap<Brand,Int>()

        val typeList = ArrayList<CharSequence>()

        fun createDataSet(){
            list.clear()
            list.add(Drinkable(R.drawable.spritef, 0, list.size, Brand.COLA,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.sprite, 0, list.size, Brand.COLA,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fantalemon, 0, list.size, Brand.COLA,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.colalemon, 0, list.size, Brand.COLA,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fantaexotic, 0, list.size, Brand.COLA,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fantafree, 0, list.size, Brand.COLA,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fpfantaf, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fpvillaf, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.peref, 0, list.size, Brand.MOLDE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.sitron, 0, list.size, Brand.MOLDE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.bring, 0, list.size, Brand.MOLDE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.pere, 0, list.size, Brand.MOLDE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fpcola, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fpcolaf, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fpfanta, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.upf, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.up, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.solosup, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.solor, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.colalight, 0, list.size, Brand.COLA,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.mozel, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.mozelf, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.villaf, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.inge, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.eventyr, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.pepsi, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.pepsilemon, 0, list.size, Brand.RINGNES,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fpvilla, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fpvannk, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.fpvann, 0, list.size, Brand.FIRSTPRICE,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.isapelsin, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.islime, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.issitron, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.isvann, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.isvannk, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.iseple, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.isgranat, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.bobleeple, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.boblesitron, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.boblevann, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.boblegranat, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.farrisgul, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.farrisgronn, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.farrisvann, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.brisrosa, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.brisrod, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.brisgronn, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.brisblo, 0, list.size, Brand.VANN,list.size,Type.STOR))
            list.add(Drinkable(R.drawable.brisorange, 0, list.size, Brand.VANN,list.size,Type.STOR))

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
        fun filterBrand(brand: Brand):ArrayList<Drinkable>{
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
    }
}
enum class Brand(private val brand: String){
    MERKE("Alle"), RINGNES("Ringnes"), COLA("Cola"), VANN("Vann"), FIRSTPRICE("FirstPrice"), MOLDE("Molde");

    override fun toString(): String {
        return brand
    }
}
enum class Type{
    TYPE, STOR, LITEN, SPESIAL, VANLIG, ENERGI, NOCCO, ALKOFRI
}