package com.example.ssuthing.ui.home

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.findFragment
import com.example.ssuthing.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetQuantityFragment : BottomSheetDialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bottom_sheet_quantity, container, false)

        var quantity: Int = 0

        val ib_multiply = view.findViewById<ImageButton>(R.id.ib_multiply)
        val ib_minus = view.findViewById<ImageButton>(R.id.ib_minus)
        val ib_plus = view.findViewById<ImageButton>(R.id.ib_plus)
        val tv_quantity = view.findViewById<TextView>(R.id.tv_quantity)
        val btn_quantity_select = view.findViewById<AppCompatButton>(R.id.btn_bottom_sheet_quantity_select)

        ib_multiply.setOnClickListener(View.OnClickListener(){
            dismiss()
        } )

        btn_quantity_select.setOnClickListener(View.OnClickListener(){
//            if(quantity != 0){
//                btn_quantity_select.isEnabled = true
//                btn_quantity_select.setBackgroundColor(Color.parseColor("#68CDC1"))
//                dismiss()
//            } else{
//                btn_quantity_select.isEnabled = false
//            }
            if(quantity != 0){
                dismiss()
            }
        } )

        ib_minus.setOnClickListener(View.OnClickListener(){
            if(quantity > 0){
                quantity -= 1
                tv_quantity.text = quantity.toString()
            }
        } )

        ib_plus.setOnClickListener(View.OnClickListener(){
            quantity += 1
            tv_quantity.text = quantity.toString()
        } )

        return view
    }
}