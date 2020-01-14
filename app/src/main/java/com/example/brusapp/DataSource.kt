package com.example.brusapp

import android.util.Log

class DataSource {
    companion object{
        val list = ArrayList<Drinkable>()
        val typeList = ArrayList<CharSequence>()
        val brandList = ArrayList<CharSequence>()

        val amountOfEachBrand = HashMap<Brand,Int>()
        val resultBrandList = ArrayList<CharSequence>()

        val brandTypepair = HashMap<Category,HashMap<Brand,Int>>()

        fun createDataSet(){
            list.clear()
            list.add(Drinkable(R.drawable.spritef, 0, list.size, Brand.COLA,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.sprite, 0, list.size, Brand.COLA,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fantalemon, 0, list.size, Brand.COLA,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.colalemon, 0, list.size, Brand.COLA,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fantaexotic, 0, list.size, Brand.COLA,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fantafree, 0, list.size, Brand.COLA,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpfantaf, 0, list.size, Brand.FIRSTPRICE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpvillaf, 0, list.size, Brand.FIRSTPRICE,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.peref, 0, list.size, Brand.MOLDE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.sitron, 0, list.size, Brand.MOLDE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.bring, 0, list.size, Brand.MOLDE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.pere, 0, list.size, Brand.MOLDE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpcola, 0, list.size, Brand.FIRSTPRICE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpcolaf, 0, list.size, Brand.FIRSTPRICE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpfanta, 0, list.size, Brand.FIRSTPRICE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.upf, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.up, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.solosup, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.solor, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.colalight, 0, list.size, Brand.COLA,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.mozel, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.mozelf, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.villaf, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.inge, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.eventyr, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.pepsi, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.pepsilemon, 0, list.size, Brand.RINGNES,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.fpvilla, 0, list.size, Brand.FIRSTPRICE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpvannk, 0, list.size, Brand.FIRSTPRICE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.fpvann, 0, list.size, Brand.FIRSTPRICE,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.isapelsin, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.islime, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.issitron, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.isvann, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.isvannk, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.iseple, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.isgranat, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.bobleeple, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.boblesitron, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.boblevann, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.boblegranat, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.farrisgul, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.farrisgronn, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.farrisvann, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisrosa, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisrod, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisgronn, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisblo, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisorange, 0, list.size, Brand.VANN,list.size,Category.STORBRUS,Supplier.RINGNES))

            list.add(Drinkable(R.drawable.fantagul05, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.solo05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.pepsilemon05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.fantarod05, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.solor05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.solou05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.pepsi05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.villa05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.villau05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.tabx, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.colalemon, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.sprite05, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.spriteu05, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.powerade, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.monsterhu, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.monstergu, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.vitaminawake, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.vitaminanti, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.vitamincare, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.ASKO))
            list.add(Drinkable(R.drawable.mozel05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.mozel05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.mountaindew, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.fuzeteagr, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.fuzeteagu, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.fuzetear, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.fuzeteagrr, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))

            list.add(Drinkable(R.drawable.colalight05, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.pepsimax05, 0, list.size, Brand.RINGNES,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.cola05, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.isklar06, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.isklar05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.urge05, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.drpepper, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.urgeg05, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.urgeu05, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.cola033, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.colau033, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.colaf033, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))

            list.add(Drinkable(R.drawable.isklark05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.imsdal02, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.imsdal05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.imsdal05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.farrisgu05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.farris05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisorange05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.farrisgr05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisgronn05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.brisrod05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.bris05, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))

            list.add(Drinkable(R.drawable.redbull02, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.redbull05, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.burnki, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.burnorig, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.redbullo, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.redbullu02, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.redbullu05, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.burns, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.burnzero, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.burnmang, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.monstergr, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.monsterju, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.batteryfr, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.batteryorig, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.monsterz, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.monstergul, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.batteryblue, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.batterynoc, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.batterynocgr, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.monsterro, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.monsterlill, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.monsterrod, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.batterypeach, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))

            list.add(Drinkable(R.drawable.powerkingu, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.powerking, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.colaener, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.colaenerm, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.trstb, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.trstg, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.battery4, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.redbull4, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.redbullw, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.redbullg, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.redbullf, 0, list.size, Brand.ENERGY,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.telemarks, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.telemarkm, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.imsdal06, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.imsdalr, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.imsdalg, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.imsdalgr, 0, list.size, Brand.VANN,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.snapplekiw, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.snapplem, 0, list.size, Brand.COLA,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.noccocarnevall, 0, list.size, Brand.NOCCO,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.noccper, 0, list.size, Brand.NOCCO,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.noccofersk, 0, list.size, Brand.NOCCO,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.noccocar, 0, list.size, Brand.NOCCO,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.noccomiami, 0, list.size, Brand.NOCCO,list.size,Category.LITENBRUS,Supplier.RINGNES))
            list.add(Drinkable(R.drawable.noccoblue, 0, list.size, Brand.NOCCO,list.size,Category.LITENBRUS,Supplier.RINGNES))


            list.add(Drinkable(R.drawable.hansaf, 0, list.size, Brand.HANSA,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.hansaff, 0, list.size, Brand.HANSA,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.hansapf, 0, list.size, Brand.HANSA,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.hansafridge, 0, list.size, Brand.HANSA,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.hansa365, 0, list.size, Brand.HANSA,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.hansal, 0, list.size, Brand.HANSA,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.hansai, 0, list.size, Brand.HANSA,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.hansap, 0, list.size, Brand.HANSA,list.size,Category.BEERNORMAL,Supplier.ASKO))

            list.add(Drinkable(R.drawable.aasspal, 0, list.size, Brand.AASS,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.aassl, 0, list.size, Brand.AASS,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.aasspinta, 0, list.size, Brand.AASS,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.aassb, 0, list.size, Brand.AASS,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.aassi, 0, list.size, Brand.AASS,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.aassf, 0, list.size, Brand.AASS,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.aassvienna, 0, list.size, Brand.AASS,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.aassp, 0, list.size, Brand.AASS,list.size,Category.BEERNORMAL,Supplier.ASKO))

            list.add(Drinkable(R.drawable.frydh, 0, list.size, Brand.FRYDENLUND,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.frydb, 0, list.size, Brand.FRYDENLUND,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.frydp, 0, list.size, Brand.FRYDENLUND,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.frydi, 0, list.size, Brand.FRYDENLUND,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.frydpil, 0, list.size, Brand.FRYDENLUND,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.frydf, 0, list.size, Brand.FRYDENLUND,list.size,Category.BEERNORMAL,Supplier.ASKO))

            list.add(Drinkable(R.drawable.heini, 0, list.size, Brand.CARLHEIN,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.heinifrid, 0, list.size, Brand.CARLHEIN,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.carlf, 0, list.size, Brand.CARLHEIN,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.carl, 0, list.size, Brand.CARLHEIN,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.carlfid, 0, list.size, Brand.CARLHEIN,list.size,Category.BEERNORMAL,Supplier.ASKO))

            list.add(Drinkable(R.drawable.ringnes033, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.ringnes, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.ringnesfrid, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.ringnesl, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.ringnesu, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.tuborgf, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.tuborgfat, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.tuborgs, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.tuborgl, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.tuborgfrid, 0, list.size, Brand.TUBRING,list.size,Category.BEERNORMAL,Supplier.ASKO))


            list.add(Drinkable(R.drawable.crabbies, 0, list.size, Brand.COLA,list.size,Category.BEERSPESIAL,Supplier.ASKO))
            list.add(Drinkable(R.drawable.munkbay05, 0, list.size, Brand.MUNKHOLM,list.size,Category.ALKOFRI,Supplier.ASKO))
            list.add(Drinkable(R.drawable.munkfat05, 0, list.size, Brand.MUNKHOLM,list.size,Category.ALKOFRI,Supplier.ASKO))
            list.add(Drinkable(R.drawable.munkorg05, 0, list.size, Brand.MUNKHOLM,list.size,Category.ALKOFRI,Supplier.ASKO))

            Brand.values().forEach {
                brandList.add(it.name)
            }

            Category.values().forEach {
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
            merke[Brand.MERKE] = 0
            brandTypepair[Category.KATEGORI] = merke
            for(item in fList){
                if(!brandTypepair.containsKey(item.category)){
                    val temp = HashMap<Brand,Int>()
                    temp[item.brand] = 1
                    temp[Brand.MERKE] = 1
                    brandTypepair[item.category] = temp

                }else{
                    if(!brandTypepair[item.category]!!.contains(item.brand)){
                        brandTypepair[item.category]!![item.brand] = 1
                        brandTypepair[item.category]!![Brand.MERKE] = 1

                    }else{
                        brandTypepair[item.category]!![item.brand] = brandTypepair[item.category]!![item.brand]!!.plus(1)
                        brandTypepair[item.category]!![Brand.MERKE] = brandTypepair[item.category]!![Brand.MERKE]!!.plus(1)
                        //temp!!.plus(1)
                    }
                }
                brandTypepair[Category.KATEGORI]!![Brand.MERKE] = brandTypepair[Category.KATEGORI]!![Brand.MERKE]!!.plus(1)
                Log.d("testtt",brandTypepair[Category.KATEGORI]!![Brand.MERKE].toString() )
                if(!brandTypepair[Category.KATEGORI]!!.containsKey(item.brand)){
                    brandTypepair[Category.KATEGORI]!![item.brand] = 1
                }else{
                    brandTypepair[Category.KATEGORI]!![item.brand] = brandTypepair[Category.KATEGORI]!![item.brand]!!.plus(1)
                }

            }

        }
        private fun getBrandTypePair(category: Category) :ArrayList<CharSequence>{
            val temp = ArrayList<CharSequence>()
            temp.add(Brand.MERKE.name)
            val map = brandTypepair[category]
            if (map != null) {
                for((k, _) in map){
                    if(k!=Brand.MERKE)
                    temp.add(k.name)
                }
            }
            return temp
        }
        fun updateTypeSpinner():ArrayList<CharSequence>{
            val temp = ArrayList<CharSequence>()
            temp.add(Category.KATEGORI.name)
            for((k,v) in brandTypepair){
                if(k != Category.KATEGORI) temp.add(k.name)
            }
            return temp
        }



        //TYPE, STOR, LITEN, SPESIAL, VANLIG, ENERGI, NOCCO, ALKOFRI
        fun updateBrandSpinner(category: Category): ArrayList<CharSequence>{
            val temp = ArrayList<CharSequence>()
            return getBrandTypePair(category)
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
        fun filterType(category: Category): ArrayList<Drinkable>{
            val filterList = ArrayList<Drinkable>()

            return filterList
        }
        fun filterType(category: Category, brand: Brand): ArrayList<Drinkable> {
            val filterList = ArrayList<Drinkable>()
            val tempList = filterBrand(brand)
            for(item in tempList){
                if(item.category == category){
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

        fun filterType(category: Category, fList:ArrayList<Drinkable>): ArrayList<Drinkable>{
            if(category == Category.KATEGORI){
                return fList
            }
            val filterList = ArrayList<Drinkable>()
            for(item in fList){
                if(item.category == category){
                    item.currindex = filterList.size
                    filterList.add(item)
                }
            }
            return filterList
        }

        fun filter(category: Category, brand: Brand): ArrayList<Drinkable>{
            return filterBrand(brand,filterType(category, list))
        }
        fun filterAmount(category: Category, brand: Brand): ArrayList<Drinkable>{
            return filterAmount(filter(category, brand))
        }
    }
}
enum class Brand{
    MERKE, RINGNES, COLA, VANN, FIRSTPRICE, MOLDE, MUNKHOLM, HANSA, ENERGY, NOCCO, SPESIAL, FRYDENLUND, AASS, TUBRING, CARLHEIN ;

}
enum class Category{
    KATEGORI, STORBRUS, LITENBRUS, BEERNORMAL, BEERSPESIAL, ALKOFRI
}

enum class Supplier{
    LEVRANDOR,ASKO,RINGNES
}