package com.jim.jezi

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.jim.jezi.adapter.mainAdapter
import com.jim.jezi.dummy.DummyContent

/**
 * A fragment representing a list of Items.
 */
class Cart : BottomSheetDialogFragment() {

    private var columnCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cart_list, container, false)

        // Set the adapter
//        if (view is RecyclerView) {
//            with(view) {
//                layoutManager = when {
//                    columnCount <= 1 -> LinearLayoutManager(context)
//                    else -> GridLayoutManager(context, columnCount)
//                }
//                adapter = MyItemRecyclerViewAdapter(DummyContent.ITEMS)
//            }
//        }

        val recyclerview: RecyclerView = view.findViewById(R.id.list)
        recyclerview.adapter = MyItemRecyclerViewAdapter(DummyContent.ITEMS)
        recyclerview.layoutManager = LinearLayoutManager(context)
        recyclerview.setHasFixedSize(true)


        val close:ImageButton = view.findViewById(R.id.closeCart)
        close.setOnClickListener(View.OnClickListener { dismiss() })
        return view
    }

    companion object {

        const val ARG_COLUMN_COUNT = "column-count"

        @JvmStatic
        fun newInstance(columnCount: Int) =
            Cart().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}