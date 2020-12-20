package com.jim.jezi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import butterknife.InjectView
import butterknife.OnClick

class product_description : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_description)

        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
        }

        val back = findViewById<ImageView>(R.id.backBtn)
        back.setOnClickListener(View.OnClickListener { onBackPressed() })


        val cart = findViewById<ImageView>(R.id.cart)
        cart.setOnClickListener(View.OnClickListener {
            val cartFragment = Cart()
            cartFragment.show(supportFragmentManager,"TAG")
        })
    }

    fun addClicked(view: View) {
        val go = Intent(this@product_description, Checkout::class.java)
        startActivity(go)
    }

}