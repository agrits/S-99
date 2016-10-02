package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P9Suite extends FunSuite{
  test("List should be properly packed"){
    assert(P9.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))==List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }
  test("Empty list should return Nil"){
    assert(P9.pack(List())==Nil)
  }
}