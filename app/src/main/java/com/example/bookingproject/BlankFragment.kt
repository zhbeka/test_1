package com.example.bookingproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bookingproject.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {

    private lateinit var binding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(inflater, container,false)
        val view = binding.root
        return view

        binding.button.setBackgroundColor(0xff60a0e0.toInt())
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment()}
}
