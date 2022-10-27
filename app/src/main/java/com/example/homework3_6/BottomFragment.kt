package com.example.homework3_6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework3_6.databinding.FragmentBottomBinding


class BottomFragment : Fragment() {
    private lateinit var binding: FragmentBottomBinding
    private var musicList = arrayListOf<Music>()
    private lateinit var adapter: MusicAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomBinding.inflate(layoutInflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = MusicAdapter(musicList, this::onClick)
        binding.recyclerBottom.adapter = adapter
    }

    fun loadData() {
        musicList.add(Music("1", "Taylor Swift", "Blank Space", "3:14"))
        musicList.add(Music("2","Silento","Watch Me","5:36"))
        musicList.add(Music("3", "The Weekend", "Earned It", "4:51"))
        musicList.add(Music("4", "The Weekend", "The Hills", "3:41"))
        musicList.add(Music("5", "Ed Sheeran", "Perfect", "3:44"))
        musicList.add(Music("6", "Imagine Dragons", "Believer", "2:55"))
        musicList.add(Music("7", "Imagine Dragons", "Natural", "3:94"))
        musicList.add(Music("8", "Justin Bieber", "Baby", "3:14"))
        musicList.add(Music("9", "Ariana Grande", "Bang Bang", "3:14"))
        musicList.add(Music("10", "Justin Bieber", "Love Yourself", "3:14"))
        musicList.add(Music("11", "Nurlan Nasip", "Eky Jurok", "3:14"))

    }

    fun onClick(position: Int) {


        val fragment: Fragment = SecondFragment()

        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment).addToBackStack(null).commit()
    }


}