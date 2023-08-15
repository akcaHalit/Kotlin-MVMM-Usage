package com.halitakca.mvmmkullanimi

import androidx.lifecycle.MutableLiveData

class MatematikRepository {
    var mathSonuc = MutableLiveData<String>()
    init {
        mathSonuc = MutableLiveData<String>("0")
    }

    fun mathSonucGetir() : MutableLiveData<String>{
        return mathSonuc
    }

    fun toplamaYap(alinanSayi1: String, alinanSayi2: String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val toplam = sayi1 + sayi2
        mathSonuc.value = toplam.toString()
    }
    fun carpmaYap(alinanSayi1: String, alinanSayi2: String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val carpim = sayi1 * sayi2
        mathSonuc.value = carpim.toString()
    }


}