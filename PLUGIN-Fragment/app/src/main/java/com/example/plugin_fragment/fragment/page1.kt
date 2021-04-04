package com.example.plugin_fragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.plugin_fragment.Comunicator
import com.example.plugin_fragment.R
import com.example.plugin_fragment.databinding.FragmentPage1Binding

class page1 : Fragment() {
    private lateinit var binding: FragmentPage1Binding
    private lateinit var comunicator: Comunicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPage1Binding.inflate(layoutInflater)
        comunicator = activity as Comunicator
        binding.btnSend.setOnClickListener {
            comunicator.passDataCom(
                    binding.etNama.text.toString(),
                    binding.etSquad.text.toString(),
                    binding.etAngkatan.text.toString(),
                    binding.etHobi.text.toString())
        }
        return binding.root
    }
    
}