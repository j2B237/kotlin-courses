/**
 * @file : Product.kt
 * @author : Yossep BINYOUM
 * @see : Represent a product object
 */

package org.product

import java.util.concurrent.atomic.AtomicLong

/*[Default constructor]*/
class Product (var name : String? = null,
    var price : Double? = null,
    var stock : Long? = null) {

    // class variable
    companion object {
        val counter : AtomicLong = AtomicLong(0)
    }
    // Writable property, field getter and setter
    var id : Long = counter.incrementAndGet()

    fun infos(){
        println("Product\n\tName: $name\n\tPrice: ${if (price == null) 0.0 else price} FCFA\n" +
                "\tStock: ${if (stock == null) 0.0 else stock} item(s)")
    }

    /*[Setter]*/
    fun price(price : Double){
        if (price < 0)
            throw IllegalArgumentException ("Price should be positive")
        this.price(price)
    }
}