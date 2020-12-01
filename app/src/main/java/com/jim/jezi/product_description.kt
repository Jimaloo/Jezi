package com.jim.jezi

import android.content.Intent
import android.os.Bundle
import android.view.View
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
        val spinnerArray = ArrayList<String>()
        spinner.setPrompt("Pick size")
        spinnerArray.add("XS UK(4-6) >")
        spinnerArray.add("XS US(4-6)")
        spinnerArray.add("XS UAE(4-6)")
        spinnerArray.add("XS KE(4-6)")
        spinnerArray.add("XS FR(4-6)")

        val spinnerAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,spinnerArray)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.setAdapter(spinnerAdapter)



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