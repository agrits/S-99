package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P7Suite extends FunSuite{
  test("It should flat a list"){
    assert(P7.flatten(List(List(1, 1), 2, List(3, List(5, 8))))==List(1, 1, 2, 3, 5, 8))
  }
}