package com.halitakca.mvmmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.halitakca.mvmmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel : MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainActivityNesnesi = this

        //binding.hesaplamaSonucu = "0"
        binding.hesaplamaSonucu = viewModel.sonuc


    }

    fun buttonToplama(alinanSayi1: String, alinanSayi2: String){
        viewModel.toplamaYap(alinanSayi1,alinanSayi2)
        binding.hesaplamaSonucu = viewModel.sonuc
    }
    fun buttonCarpma(alinanSayi1: String, alinanSayi2: String){
        viewModel.carpmaYap(alinanSayi1,alinanSayi2)
        binding.hesaplamaSonucu = viewModel.sonuc
    }
}