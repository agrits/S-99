package com.github.agrits.s99.arithmetic

import S99Int._
import org.scalatest.FunSuite

/**
  * Created by grits on 28.08.16.
  */
class ArithmeticSuite extends FunSuite{
  test("P31") {
    assert(2.isPrime)
    assert(3.isPrime)
    assert(5.isPrime)
    assert(13.isPrime)
    assert(138371.isPrime)
    assert((1 to 100).filter(_.isPrime).size == 25)
  }
}
