package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P19Suite extends FunSuite{
  test("List should be rotated to the left by 3 places"){
    assert(P19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))==List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
  }
  test("List should be rotated to right by 2 places"){
    assert(P19.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))==List('j, 'k,'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }
  test("List should not be"){
    assert(P19.rotate(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))==List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }
}