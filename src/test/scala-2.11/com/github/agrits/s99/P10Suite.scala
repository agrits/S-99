package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P10Suite extends FunSuite{
  test("Check if list 'encodes' properly"){
    assert(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))==List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
  test("Empty list should return Nil"){
    assert(P10.encode(List())==Nil)
  }
}