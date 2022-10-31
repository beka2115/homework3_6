package com.example.homework3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.homework3_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var fragment: BottomFragment = BottomFragment()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()


    }
}






