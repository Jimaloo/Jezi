package com.jim.jezi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class Checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)
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