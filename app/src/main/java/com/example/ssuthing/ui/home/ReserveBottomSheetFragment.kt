package com.example.ssuthing.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.setFragmentResultListener
import com.example.ssuthing.R
import com.example.ssuthing.ui.homea.BottomSheetCalendarFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ReserveBottomSheetFragment : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_reserve_bottom_sheet, container, false)
        val tv_item_name = view.findViewById<TextView>(R.id.tv_item_name)
        val btn_day_select = view.findViewById<AppCompatButton>(R.id.btn_day_select)
        setFragmentResultListener("itemName"){requestKey, bundle ->
            tv_item_name.text = bundle.getString("itemName")
        }
        btn_day_select.setOnClickListener( View.OnClickListener() {
            val bottomSheet = BottomSheetCalendarFragment()
            activity?.let { bottomSheet.show(it.supportFragmentManager, bottomSheet.tag) }
//            Log.d("hi","hi")
        })
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}