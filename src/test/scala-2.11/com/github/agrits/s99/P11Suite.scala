package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P11Suite extends FunSuite {
  test("Method should encode properly") {
    assert(P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e)))
  }
  test("Empty list should return Nil"){
  assert(P11.encodeModified(List()) == Nil)
  }
}