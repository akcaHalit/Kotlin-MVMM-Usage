package com.halitakca.mvmmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel  : ViewModel() {
    var sonuc = MutableLiveData<String>()
    var mrepo = MatematikRepository()
    init {
        sonuc = mrepo.mathSonucGetir()
    }



    fun toplamaYap(alinanSayi1: String, alinanSayi2: String){
        mrepo.toplamaYap(alinanSayi1,alinanSayi2)
    }
    fun carpmaYap(alinanSayi1: String, alinanSayi2: String){
        mrepo.carpmaYap(alinanSayi1,alinanSayi2)
    }

    /*      without Repository
    val sayi1 = alinanSayi1.toInt()
    val sayi2 = alinanSayi2.toInt()
    val toplam = sayi1 + sayi2
    //sonuc = toplam.toString()
    sonuc.value = toplam.toString()
 */


}