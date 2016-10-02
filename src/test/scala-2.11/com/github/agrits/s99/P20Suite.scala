package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P20Suite extends FunSuite{
  test("Second element should be removed"){
    assert(P20.removeAt(1, List('a, 'b, 'c, 'd))==(List('a, 'c, 'd), 'b))
  }
}