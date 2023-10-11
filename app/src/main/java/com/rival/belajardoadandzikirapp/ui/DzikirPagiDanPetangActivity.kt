package com.rival.belajardoadandzikirapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.rival.belajardoadandzikirapp.R
import com.rival.belajardoadandzikirapp.adapter.DzikirDoaAdapter
import com.rival.belajardoadandzikirapp.databinding.ActivityDzikirPagiDanPetangBinding
import com.rival.belajardoadandzikirapp.model.DataDzikirDoa
import com.rival.belajardoadandzikirapp.ui.detail.DzikirPagiActivity
import com.rival.belajardoadandzikirapp.ui.detail.DzikirPetangActivity

class DzikirPagiDanPetangActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityDzikirPagiDanPetangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiDanPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setView()
    }

    private fun setView() {
        binding.apply {
            imgBtnDzikirPagi.setOnClickListener (this@DzikirPagiDanPetangActivity)
            imgBtnDzikirPetang.setOnClickListener(this@DzikirPagiDanPetangActivity)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.img_btn_dzikir_pagi -> {
                val intentDpagi = Intent(
                    this@DzikirPagiDanPetangActivity, DzikirPagiActivity::class.java)
                startActivity(intentDpagi)
            }
            R.id.img_btn_dzikir_petang -> {
                val intentDpetang = Intent(
                    this@DzikirPagiDanPetangActivity, DzikirPetangActivity::class.java)
                startActivity(intentDpetang)
            }
        }
    }
}