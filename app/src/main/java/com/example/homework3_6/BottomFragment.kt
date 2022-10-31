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

    companion object {
        const val KEY_FOR_MUSIC: String = "Key"


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBottomBinding.inflate(layoutInflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = MusicAdapter(musicList, this::onClick)
        binding.recyclerBottom.adapter = adapter
    }

    private fun loadData() {
        musicList.clear()
        musicList.add(Music("1", "Taylor Swift", "Blank Space", "3:14", 0))
        musicList.add(Music("2", "Silento", "Watch Me", "5:36", 1))
        musicList.add(Music("3", "The Weekend", "Earned It", "4:51", 2))
        musicList.add(Music("4", "The Weekend", "The Hills", "3:41", 3))
        musicList.add(Music("5", "Ed Sheeran", "Perfect", "3:44", 4))
        musicList.add(Music("6", "Imagine Dragons", "Believer", "2:55", 5))
        musicList.add(Music("7", "Imagine Dragons", "Natural", "3:94", 6))
        musicList.add(Music("8", "Justin Bieber", "Baby", "3:14", 7))
        musicList.add(Music("9", "Ariana Grande", "Bang Bang", "3:14", 8))
        musicList.add(Music("10", "Justin Bieber", "Love Yourself", "3:14", 9))
        musicList.add(Music("11", "Nurlan Nasip", "Eky Jurok", "3:14", 10))

    }

    private fun onClick(position: Int) {

        val bundle = Bundle()
       bundle.putString(KEY_FOR_MUSIC,musicList[position].music)
        val fragment: Fragment = SecondFragment()
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment).addToBackStack(null).commit()


    }


}