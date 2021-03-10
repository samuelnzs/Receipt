package com.example.receipt.RecyclerViewAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.receipt.OutDocInfo
import com.example.receipt.R

class OutgoingAdapter(private val outgoingList : ArrayList<OutDocInfo>) : RecyclerView.Adapter<OutgoingAdapter.OutgoingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OutgoingViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.outgoing_row_layout,
            parent, false)

        return OutgoingViewHolder(itemView)
    }

    override fun getItemCount(): Int = outgoingList.size

    class OutgoingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imgOutDoc)
        val textView1 : TextView = itemView.findViewById(R.id.lblCustomerName)
        val textView2 : TextView = itemView.findViewById(R.id.lblOutDocId)
        val textView3 : TextView = itemView.findViewById(R.id.lblOutShortDes)
        val textView4 : TextView = itemView.findViewById(R.id.lblOutDate)
        val textView5 : TextView = itemView.findViewById(R.id.lblOutTime)
    }



    override fun onBindViewHolder(holder: OutgoingViewHolder, position: Int) {
        val currentReceipt = outgoingList[position]


        holder.imageView.setImageResource(currentReceipt.imageResources)
        holder.textView1.text = currentReceipt.CustName
        holder.textView2.text = currentReceipt.OutId
        holder.textView3.text = currentReceipt.OutDocDes
        holder.textView4.text = currentReceipt.OutDocDate
        holder.textView5.text = currentReceipt.OutDocTime

    }

}