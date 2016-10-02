package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P18Suite extends FunSuite{
  test("Function should return proper slice"){
    assert(P18.slice(3,7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))==List('d,'e,'f,'g))
  }
}