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

}