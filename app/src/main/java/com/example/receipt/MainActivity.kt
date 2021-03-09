package com.example.receipt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.receipt.ui.main.SectionsPagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = SectionsPagerAdapter(this, supportFragmentManager)
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        val add: FloatingActionButton = findViewById(R.id.add)



        add.setOnClickListener {
            //val dialogView : View
        }
    }

    /*private fun generateDummyList(size: Int): List<ReceiptInfo>{
        val list = ArrayList<ReceiptInfo>()

        for(i in 0 until size){

           val status = when(i%2){
                0 -> "pending"
                else -> "Received"
            }

            val item = ReceiptInfo(R.drawable.receipt_image, "PA100$i", "$i/12/2021", status)
            list+= item
        }
        return list
    }*/
}