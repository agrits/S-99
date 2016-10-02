package com.github.agrits.s99

import org.scalatest.FunSuite

/**
  * Created by grits on 21.05.16.
  */
class P1Suite extends FunSuite{
  test("Result should be the last element"){
    assert(P1.last(List(1,2,3))==3)
  }
  test("Last element of empty list should produce an NoSuchElementException"){
    intercept[NoSuchElementException]{
      P1.last(List())
    }
  }
}