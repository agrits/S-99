package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P12Suite extends FunSuite{
  test("List should decode properly"){
    assert(P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))==List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
  test("Empty list should return empty list"){
    assert(P12.decode(List())==List())
  }
}