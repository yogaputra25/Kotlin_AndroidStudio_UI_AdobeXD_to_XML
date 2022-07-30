package com.respapi.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.respapi.myapp.uiFragment.Home
import com.respapi.myapp.uiFragment.Search
import com.respapi.myapp.uiFragment.Shopp
import com.respapi.myapp.uiFragment.WhistList

class HomeSc : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_sc)
        bottomNav = findViewById(R.id.nav_view) as BottomNavigationView


        val fragment = Search.newInstance()
        loadFragment(Home())

        bottomNav.setOnItemSelectedListener{ item ->
            when (item.itemId) {
                R.id.navigation_home-> {
                    loadFragment(Home())
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_search -> {
                    loadFragment(Search())
                    return@setOnItemSelectedListener true
                }

                R.id.navigation_wishlist -> {
                    loadFragment(WhistList())
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_shopp -> {
                    loadFragment(Shopp())
                    return@setOnItemSelectedListener true
                }
            }
            false
        }



    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }






    }
