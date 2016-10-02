package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P22Suite extends FunSuite{
  test("List should cotain numbers from 4 to 10"){
    assert(P22.range(4, 10)==List(4,5,6,7,8,9,10))
  }
}