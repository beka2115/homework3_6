package com.example.homework3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework3_6.databinding.FragmentUpperBinding


class UpperFragment : Fragment() {
    private lateinit var binding: FragmentUpperBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentUpperBinding.inflate(layoutInflater)
        return binding.root
    }


    }
