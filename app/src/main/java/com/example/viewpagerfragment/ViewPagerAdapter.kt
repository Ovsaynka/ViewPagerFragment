package com.example.viewpagerfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fm: FragmentManager?, lifecycle: Lifecycle) :
    FragmentStateAdapter(fm!!, lifecycle) {
    private val count = 3  //count tables

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {     //when the position is n(some number), the desired fragment will be opened
            0 -> fragment = FragmentA()
            1 -> fragment = FragmentB()
            2 -> fragment = FragmentC()
        }
        return fragment!!
    }

    override fun getItemCount(): Int {
        return count   //get count tables
    }

}