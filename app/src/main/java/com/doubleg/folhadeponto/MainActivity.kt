package com.doubleg.folhadeponto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.doubleg.folhadeponto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    binding.textViewTitle.text = getString(R.string.title_home)
                    true
                }
                R.id.navigation_dashboard -> {
                    binding.textViewTitle.text = getString(R.string.title_dashboard)
                    true
                }
                R.id.navigation_notifications -> {
                    binding.textViewTitle.text = getString(R.string.title_notifications)
                    true
                }
                else -> false
            }
        }

        binding.bottomNavigation.selectedItemId = R.id.navigation_home
    }
}