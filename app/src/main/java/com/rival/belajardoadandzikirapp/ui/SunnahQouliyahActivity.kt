package com.rival.belajardoadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rival.belajardoadandzikirapp.R
import com.rival.belajardoadandzikirapp.adapter.DzikirDoaAdapter
import com.rival.belajardoadandzikirapp.databinding.ActivitySunnahQouliyahBinding
import com.rival.belajardoadandzikirapp.model.DataDzikirDoa

class SunnahQouliyahActivity : AppCompatActivity() {

    lateinit var binding : ActivitySunnahQouliyahBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivitySunnahQouliyahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sunnah - Sunnah Qouliyah"

        binding.apply {
            rvQauliyahShalat.layoutManager = LinearLayoutManager(this@SunnahQouliyahActivity)
            rvQauliyahShalat.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
        }


        }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }


}