package com.example.receipt.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.receipt.Fragment1
import com.example.receipt.Fragment2
import com.example.receipt.Fragment3
import com.example.receipt.R

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2,
        R.string.tab_text_3
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        /*var fragment: Fragment = Fragment1()

       when(position){
           0 -> fragment = Fragment1()
           1 -> fragment = Fragment2()
           2 -> fragment = Fragment3()
       }*/
        return when (position) {
            0 -> {
                Fragment1()
            }
            1 -> {
                Fragment2()
            }
            2 -> {
                Fragment3()
            }
            else -> getItem(position)
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 3 total pages.
        return 3
    }
}