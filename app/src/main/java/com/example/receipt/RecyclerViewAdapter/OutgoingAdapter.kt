package com.example.receipt.RecyclerViewAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.receipt.OutDocInfo
import com.example.receipt.R

class OutgoingAdapter(private val outgoingList : ArrayList<OutDocInfo>) : RecyclerView.Adapter<OutgoingAdapter.OugoingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OugoingViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.outgoing_row_layout,
            parent, false)

        return OugoingViewHolder(itemView)
    }

    override fun getItemCount(): Int = outgoingList.size

    class OugoingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imgOutDoc)
        val textView1 : TextView = itemView.findViewById(R.id.lblCustomerName)
        val textView2 : TextView = itemView.findViewById(R.id.lblOutDocId)
        val textView3 : TextView = itemView.findViewById(R.id.lblOutDate)
        val textView4 : TextView = itemView.findViewById(R.id.lblOutTime)
    }



    override fun onBindViewHolder(holder: OugoingViewHolder, position: Int) {
        val currentReceipt = outgoingList[position]


            holder.imageView.setImageResource(currentReceipt.imageResources)
            holder.textView1.text = currentReceipt.text1
            holder.textView2.text = currentReceipt.text2
            holder.textView3.text = currentReceipt.text3
            holder.textView4.text = currentReceipt.text4

    }

}