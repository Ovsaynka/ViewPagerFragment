package com.example.viewpagerfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    private var tabLayout: TabLayout? = null  //variable for tableLayout
    private var viewPager: ViewPager2? = null //variable for viewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout = findViewById(R.id.tabs)   //find by id our tableLayout
        viewPager = findViewById(R.id.view_pager)  //find by id our viewPager
        viewPager!!.adapter = ViewPagerAdapter(
            supportFragmentManager,
            lifecycle
        )  //the adapter is applied to the fragment

        //give names to the pages on tableLayout
        TabLayoutMediator(
            tabLayout!!,
            viewPager!!,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->   //according to the position the table name is assigned
                when (position) {
                    0 -> tab.text = "TabLayout1"
                    1 -> tab.text = "TabLayout2"
                    2 -> tab.text = "TabLayout3"
                }
            }).attach()
    }
}