package org.example

import org.product.Product
import kotlin.test.Test
import kotlin.test.assertNotEquals

class ProductTest {

    @Test fun productIdIsValid() {
        val p1 = Product()
        val p2 = Product()

        assertNotEquals(p1.id, p2.id, "product Id should be different")
    }
}