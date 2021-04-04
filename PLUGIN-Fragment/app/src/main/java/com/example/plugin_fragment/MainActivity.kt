package com.example.plugin_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.plugin_fragment.databinding.ActivityMainBinding
import com.example.plugin_fragment.fragment.page1
import com.example.plugin_fragment.fragment.page2

class MainActivity : AppCompatActivity(),Comunicator {
    private lateinit var binding: ActivityMainBinding
    val input = page1()
    val output = page2()
    val managerFragment = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        managerFragment.beginTransaction().replace(R.id.fragmentContainer,input,page1::class.java.simpleName)
            .commit()
    }

    override fun passDataCom(nama: String, squad: String, angkatan: String, hobi: String) {
        val bundle = Bundle()
        bundle.putString("tvNama",nama)
        bundle.putString("tvSquad",squad)
        bundle.putString("tvAngkatan",angkatan)
        bundle.putString("tvHobi",hobi)
        output.arguments = bundle

        managerFragment.beginTransaction().replace(R.id.fragmentContainer,output,page2::class.java.simpleName)
            .addToBackStack(null)
            .commit()

    }
}