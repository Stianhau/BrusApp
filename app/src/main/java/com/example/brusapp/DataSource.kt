package com.example.brusapp

class DataSource {
    companion object{
        val list = ArrayList<Soda>()


        val brandList = ArrayList<CharSequence>()
        fun createDataSet(){
            list.clear()
            list.add(Soda(R.drawable.spritef, 0, list.size, Brand.COLA,list.size))
            list.add(Soda(R.drawable.sprite, 0, list.size, Brand.COLA,list.size))
            list.add(Soda(R.drawable.fantalemon, 0, list.size, Brand.COLA,list.size))
            list.add(Soda(R.drawable.colalemon, 0, list.size, Brand.COLA,list.size))
            list.add(Soda(R.drawable.fantaexotic, 0, list.size, Brand.COLA,list.size))
            list.add(Soda(R.drawable.fantafree, 0, list.size, Brand.COLA,list.size))
            list.add(Soda(R.drawable.fpfantaf, 0, list.size, Brand.FIRSTPRICE,list.size))
            list.add(Soda(R.drawable.fpvillaf, 0, list.size, Brand.FIRSTPRICE,list.size))
            list.add(Soda(R.drawable.peref, 0, list.size, Brand.MOLDE,list.size))
            list.add(Soda(R.drawable.sitron, 0, list.size, Brand.MOLDE,list.size))
            list.add(Soda(R.drawable.bring, 0, list.size, Brand.MOLDE,list.size))
            list.add(Soda(R.drawable.pere, 0, list.size, Brand.MOLDE,list.size))
            list.add(Soda(R.drawable.fpcola, 0, list.size, Brand.FIRSTPRICE,list.size))
            list.add(Soda(R.drawable.fpcolaf, 0, list.size, Brand.FIRSTPRICE,list.size))
            list.add(Soda(R.drawable.fpfanta, 0, list.size, Brand.FIRSTPRICE,list.size))
            list.add(Soda(R.drawable.upf, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.up, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.solosup, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.solor, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.colalight, 0, list.size, Brand.COLA,list.size))
            list.add(Soda(R.drawable.mozel, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.mozelf, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.villaf, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.inge, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.eventyr, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.pepsi, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.pepsilemon, 0, list.size, Brand.RINGNES,list.size))
            list.add(Soda(R.drawable.fpvilla, 0, list.size, Brand.FIRSTPRICE,list.size))
            list.add(Soda(R.drawable.fpvannk, 0, list.size, Brand.FIRSTPRICE,list.size))
            list.add(Soda(R.drawable.fpvann, 0, list.size, Brand.FIRSTPRICE,list.size))
            list.add(Soda(R.drawable.isapelsin, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.islime, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.issitron, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.isvann, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.isvannk, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.iseple, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.isgranat, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.bobleeple, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.boblesitron, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.boblevann, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.boblegranat, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.farrisgul, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.farrisgronn, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.farrisvann, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.brisrosa, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.brisrod, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.brisgronn, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.brisblo, 0, list.size, Brand.VANN,list.size))
            list.add(Soda(R.drawable.brisorange, 0, list.size, Brand.VANN,list.size))

            brandList.add("Alle")
            brandList.add("Ringnes")
            brandList.add("Cola")
            brandList.add("Vann")
            brandList.add("FirstPrice")
            brandList.add("Molde")
        }
        fun updateCurrindex(){
            for(item in list){
                item.currindex = item.index
            }
        }
        fun sortOnBrand(brand: Brand):ArrayList<Soda>{
                val sortList = ArrayList<Soda>()
                for(item in list){
                    if(item.brand == brand){
                        item.currindex = sortList.size
                        sortList.add(item)
                    }
                }
            return sortList
        }

        fun sortOnBrand():ArrayList<Soda>{
            updateCurrindex()
            return list
        }

        fun sortOnAmount() :ArrayList<Soda> {
            val sortList = ArrayList<Soda>()
            for(item in list){
                if(item.amount != 0){
                    sortList.add(item)
                }
            }
            return sortList
        }
    }
}
enum class Brand{
    RINGNES, COLA, VANN, FIRSTPRICE, MOLDE
}