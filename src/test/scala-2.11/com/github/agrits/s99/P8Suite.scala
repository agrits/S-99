package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P8Suite extends FunSuite{
  test("The list should contain only unique elements"){
    assert(P8.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))==List('a, 'b, 'c, 'a, 'd, 'e))
  }
  test("Empty list should return Nil"){
    assert(P8.compress(List())==Nil)
  }
}