package com.rival.belajardoadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rival.belajardoadandzikirapp.R
import com.rival.belajardoadandzikirapp.adapter.DzikirDoaAdapter
import com.rival.belajardoadandzikirapp.databinding.ActivityDzikirDanDoaHarianBinding
import com.rival.belajardoadandzikirapp.model.DataDzikirDoa
import com.rival.belajardoadandzikirapp.model.DzikirDoaModel

class DzikirDanDoaHarianActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirDanDoaHarianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirDanDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir & Doa Harian"

        binding.apply {
            rvDzikirSetiapHarian.layoutManager = LinearLayoutManager(this@DzikirDanDoaHarianActivity)
            rvDzikirSetiapHarian.adapter = DzikirDoaAdapter(GetDzikirDoa())
        }
    }

    fun GetDzikirDoa() : ArrayList<DzikirDoaModel> {
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafas = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        val kumpul = arrayListOf<DzikirDoaModel>()

        for (i in desc.indices) {
            val gabung = DzikirDoaModel(
                desc[i],
                lafas[i],
                terjemah[i]
            )
            kumpul.addAll(listOf(gabung))
        }
        return kumpul
    }
}