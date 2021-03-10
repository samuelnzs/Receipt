package com.example.receipt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.receipt.RecyclerViewAdapter.IncomingAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Fragment1 : Fragment() {

    lateinit var recycle : RecyclerView
    public  val  list = ArrayList<InDocInfo>()
    private val adapter: IncomingAdapter = IncomingAdapter(list)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1_layout, container, false)
    }

   override fun onViewCreated(view: View,savedInstanceState: Bundle?){
       super.onViewCreated(view, savedInstanceState)

       recycle = view. findViewById(R.id.rcyIncomingDoc)
       val adapter = IncomingAdapter(list)
       recycle.layoutManager = LinearLayoutManager(activity)
       recycle.adapter = adapter

       val addButton: FloatingActionButton = view.findViewById(R.id.addInDoc)

       addButton.setOnClickListener{
           val dialogView : View = LayoutInflater.from(context).inflate(R.layout.add_indoc,null)
           val builder : AlertDialog.Builder? =
               context?.let { it1 -> AlertDialog.Builder(it1).setView(dialogView).setTitle("Add Incoming Document") }
           val alert : AlertDialog = builder!!.show()
       }
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list.add(InDocInfo(R.drawable.receipt_image, "Stone n CO" , "PA1001","Des1", "01/12/2021", "11:54"))
        list.add(InDocInfo(R.drawable.receipt_image, "TNT","PA1002","Des1", "2/12/2021","11:50"))
        list.add(InDocInfo(R.drawable.receipt_image, "VTMT","PA1003","Des1", "03/12/2021","11:50"))
        list.add(InDocInfo(R.drawable.receipt_image, "SUPREME","PA1004","Des1", "04/12/2021","11:50"))
        list.add(InDocInfo(R.drawable.receipt_image, "BAPE","PA1005","Des1", "05/12/2021","11:50"))
        list.add(InDocInfo(R.drawable.receipt_image, "EMMANUAL","PA1006","Des1", "06/12/2021","11:50"))
        list.add(InDocInfo(R.drawable.receipt_image, "NIKE","PA1007","Des1", "07/12/2021","11:50"))
        list.add(InDocInfo(R.drawable.receipt_image, "ADIDAS","PA1008","Des1", "08/12/2021","11:50"))
        list.add(InDocInfo(R.drawable.receipt_image, "PUMA","PA1009","Des1", "09/12/2021","11:50"))
        list.add(InDocInfo(R.drawable.receipt_image, "VANS","PA10010","Des1", "10/12/2021","11:50"))
        list.add(InDocInfo(R.drawable.receipt_image, "Jordan","PA10011","Des1", "11/12/2021","11:50"))
        adapter.notifyDataSetChanged()
    }

}