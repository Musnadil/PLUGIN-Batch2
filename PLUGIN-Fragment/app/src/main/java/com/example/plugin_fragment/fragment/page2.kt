package com.example.plugin_fragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.plugin_fragment.Comunicator
import com.example.plugin_fragment.R
import com.example.plugin_fragment.databinding.FragmentPage2Binding

class page2 : Fragment() {
    private lateinit var binding: FragmentPage2Binding
    var Nama : String? = ""
    var Squad : String? = ""
    var Angkatan : String? = ""
    var Hobi : String? = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPage2Binding.inflate(layoutInflater)

        Nama = arguments?.getString("tvNama")
        Squad = arguments?.getString("tvSquad")
        Angkatan = arguments?.getString("tvAngkatan")
        Hobi = arguments?.getString("tvHobi")

        binding.tvNama.text = Nama
        binding.tvSquad.text = Squad
        binding.tvAngkatan.text = Angkatan
        binding.tvHobi.text = Hobi

        return binding.root
    }
}