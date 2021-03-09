package com.example.receipt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.receipt.RecyclerViewAdapter.AllReceiptAdapter
import com.example.receipt.RecyclerViewAdapter.PendingReceiptAdapter

class Fragment2 : Fragment() {

    lateinit var recycle : RecyclerView
    private val list = ArrayList<ReceiptInfo>()
    private val adapter: PendingReceiptAdapter = PendingReceiptAdapter(list)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2_layout, container, false)
    }

    override fun onViewCreated(view: View,savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        recycle = view. findViewById(R.id.rcyPendingReceipt)
        val adapter = AllReceiptAdapter(list)
        recycle.layoutManager = LinearLayoutManager(activity)
        recycle.adapter = adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list.add(ReceiptInfo(R.drawable.receipt_image, "Stone n CO" , "PA1001", "01/12/2021", "11:54", "Pending"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "TNT","PA1002", "2/12/2021","11:50", "Received"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "VTMT","PA1003", "03/12/2021","11:50", "Pending"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "SUPREME","PA1004", "04/12/2021","11:50", "Pending"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "BAPE","PA1005", "05/12/2021","11:50", "Received"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "EMMANUAL","PA1006", "06/12/2021","11:50", "Received"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "NIKE","PA1007", "07/12/2021","11:50", "Pending"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "ADIDAS","PA1008", "08/12/2021","11:50", "Pending"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "PUMA","PA1009", "09/12/2021","11:50", "Pending"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "VANS","PA10010", "10/12/2021","11:50", "Received"))
        list.add(ReceiptInfo(R.drawable.receipt_image, "Jordan","PA10011", "11/12/2021","11:50", "Received"))
        adapter.notifyDataSetChanged()
    }
}