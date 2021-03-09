package com.example.receipt.RecyclerViewAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.receipt.InDocInfo
import com.example.receipt.R

class IncomingAdapter(private val incomingList : ArrayList<InDocInfo>) : RecyclerView.Adapter<IncomingAdapter.IncomingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IncomingViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.incoming_row_layout,
        parent, false)

        return IncomingViewHolder(itemView)
    }
    override fun getItemCount(): Int = incomingList.size

    class IncomingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imgInDoc)
        val textView1 : TextView = itemView.findViewById(R.id.lblSupplierName)
        val textView2 : TextView = itemView.findViewById(R.id.lblInDocId)
        val textView3 : TextView = itemView.findViewById(R.id.lblInDate)
        val textView4 : TextView = itemView.findViewById(R.id.lblInTime)
    }

    override fun onBindViewHolder(holder: IncomingViewHolder, position: Int) {
        val currentReceipt = incomingList[position]

        holder.imageView.setImageResource(currentReceipt.imageResources)
        holder.textView1.text = currentReceipt.text1
        holder.textView2.text = currentReceipt.text2
        holder.textView3.text = currentReceipt.text3
        holder.textView4.text = currentReceipt.text4
    }



}