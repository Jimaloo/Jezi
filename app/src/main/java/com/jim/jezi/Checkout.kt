package com.jim.jezi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.RadioButton
import androidx.fragment.app.FragmentManager

class Checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val sheet = findViewById<ImageButton>(R.id.imageButton)
        sheet.setOnClickListener{
            val bottomSheet = BotttomSheet()
            bottomSheet.show(supportFragmentManager,"TAG")

        }
    }

    fun onRadioButtonClicked(view: View){
        if(view is RadioButton)

            when(view.id){
                R.id.card ->
                    if (view.isChecked){

                    }
                R.id.cash ->
                    if (view.isChecked){

                    }
                R.id.mpesa ->
                    if (view.isChecked){

                    }


            }

    }

}