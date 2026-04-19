/**
 * @file : Product.kt
 * @author : Yossep BINYOUM
 * @see : Represent a product object
 */

package org.product

import java.util.concurrent.atomic.AtomicLong

/*[Default constructor]*/
class Product (var name : String?,
    var price : Double?,
    var stock : Long?) {

    // classe variable
    companion object {
        val counter : AtomicLong = AtomicLong(0)
    }

    var id : Long = counter.incrementAndGet()
    
}