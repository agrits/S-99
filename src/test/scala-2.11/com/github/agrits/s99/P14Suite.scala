package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P14Suite extends FunSuite{
  test("Elements of list should be duplicated"){
    assert(P14.duplicate(List('a, 'b, 'c, 'c, 'd))==List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }
}