package com.doubleg.folhadeponto

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.doubleg.folhadeponto.databinding.ActivityMainBinding
import com.doubleg.folhadeponto.model.User
import com.doubleg.folhadeponto.room.Database
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        GlobalScope.launch(Dispatchers.IO) {
            Database.database.userDao().insertUser(User("teste", "teste"))


            var listUser = Database.database.userDao().getByName("teste")
            Log.d("teste", listUser.toString())

            val user = User(8, "teste2", "teste2")

            Database.database.userDao().update(user)

            listUser = Database.database.userDao().getByName("teste")
            Log.d("teste", listUser.toString())
        }

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