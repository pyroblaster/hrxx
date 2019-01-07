package com.example.panda.retrofitrecycler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.panda.retrofitrecycler.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = MainFragment.newInstance()
        openFragment(homeFragment)

        }

 /*       if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.root_layout, MainFragment.newInstance(), "MainFragment")
                .commit()
        }
    }
*/
 private fun openFragment(fragment: Fragment) {
     val transaction = supportFragmentManager.beginTransaction()
     transaction.replace(R.id.container, fragment)
     transaction.commit()
 }
}
