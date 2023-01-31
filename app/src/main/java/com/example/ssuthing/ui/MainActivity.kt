package com.example.ssuthing.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ssuthing.R
import com.example.ssuthing.databinding.ActivityMainBinding
import com.example.ssuthing.ui.home.HomeFragment
import com.example.ssuthing.ui.mylist.MylistFragment
import com.example.ssuthing.ui.mypage.MypageFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)


        val bottomNavBar = findViewById<BottomNavigationView>(R.id.bottom_navi)
        bottomNavBar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_fragment1 -> {
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_container, homeFragment).commit()
                }
                R.id.item_fragment2 -> {
                    val communityFragment = MylistFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_container, communityFragment).commit()
                }

                R.id.item_fragment3 -> {
                    val mypageFragment = MypageFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fl_container, mypageFragment).commit()
                }
            }
            true
        }

        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fl_container, homeFragment).commit()
        //selectedItemId=R.id.item_fragment1

        bottomNavBar.itemIconTintList = null
    }
}