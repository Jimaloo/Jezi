package com.jim.jezi.dummy

import java.util.ArrayList
import java.util.HashMap


object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()



    private val COUNT = 4

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)

    }

    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(position.toString(), "FC Barcelona 2019/20 \n Stadium Home " + position,"Ksh 1800.00")
    }



    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String,val details:String) {
        override fun toString(): String = content
    }
}