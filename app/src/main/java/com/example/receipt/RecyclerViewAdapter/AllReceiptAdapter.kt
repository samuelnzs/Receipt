package com.example.receipt.RecyclerViewAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.receipt.R
import com.example.receipt.ReceiptInfo

class AllReceiptAdapter(private val allReceiptList : ArrayList<ReceiptInfo>) : RecyclerView.Adapter<AllReceiptAdapter.AllReceiptViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllReceiptViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.rowlayout,
        parent, false)

        return AllReceiptViewHolder(itemView)
    }
    override fun getItemCount(): Int = allReceiptList.size

    class AllReceiptViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imgReceipt)
        val textView1 : TextView = itemView.findViewById(R.id.lblSupplierName)
        val textView2 : TextView = itemView.findViewById(R.id.lblReceiptId)
        val textView3 : TextView = itemView.findViewById(R.id.lbldate)
        val textView4 : TextView = itemView.findViewById(R.id.lbltime)
        val textView5 : TextView = itemView.findViewById(R.id.current_status)
    }

    override fun onBindViewHolder(holder: AllReceiptViewHolder, position: Int) {
        val currentReceipt = allReceiptList[position]

        holder.imageView.setImageResource(currentReceipt.imageResources)
        holder.textView1.text = currentReceipt.text1
        holder.textView2.text = currentReceipt.text2
        holder.textView3.text = currentReceipt.text3
        holder.textView4.text = currentReceipt.text4
        holder.textView5.text = currentReceipt.text5
    }



}