package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P13Suite extends FunSuite{
  test("List should be encoded properly"){
    assert(P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'b, 'c, 'a, 'a, 'd, 'd, 'd))==List((4, 'a), (2, 'b), (1, 'c), (2, 'a), (3, 'd)))
  }
}