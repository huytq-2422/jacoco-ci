package com.tr4n.templatejacoco

import org.junit.Assert
import org.junit.Test

class FooTest {

    private val foo = Foo()

    @Test
    fun `add return a - b when return a less than b`() {
        Assert.assertEquals(-1, foo.add(2, 3))
    }

    @Test
    fun `add return 0 when a == b`() {
        Assert.assertEquals(0, foo.add(2, 2))
    }

    @Test
    fun `add return a + b when a greater than b`() {
        Assert.assertEquals(3, foo.add(2, 1))
    }
}
