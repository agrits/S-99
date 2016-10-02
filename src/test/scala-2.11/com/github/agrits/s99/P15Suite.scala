package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P15Suite extends FunSuite{
  test("Elements of list should be duplicated 3 times"){
    assert(P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd))==List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }
}