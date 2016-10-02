package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P16Suite extends FunSuite{
  test("Every nth element of the list should be dropped"){
    assert(P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))==List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }
}