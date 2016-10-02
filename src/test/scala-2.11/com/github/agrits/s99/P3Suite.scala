package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P3Suite extends FunSuite{
  test("Result should be the 3"){
    assert(P3.nth(1, List(1,3,9,7,12))==3)
  }
  test("If length of list length is smaller or equal to n then function invoking should produce an IndexOutOfBoundsException"){
    intercept[IndexOutOfBoundsException]{
      P3.nth(2, List(1,2))
    }
    intercept[IndexOutOfBoundsException]{
      P3.nth(1, List())
    }
  }
}