package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P24Suite extends FunSuite{
  test("Method should return 6 numbers, all should differ and be between 1 and 49"){
    val selected = P24.lotto(6, 49)
    assert(selected.distinct.size==6)
    selected.foreach(x=>assert(x>=1 && x<=49))
  }
}