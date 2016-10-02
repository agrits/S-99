package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P2Suite extends FunSuite{
  test("Result should be the last but one element"){
    assert(P2.penultimate(List(1,2,3))==2)
  }
  test("Invoking penultimate method on empty List should produce an Exception"){
    intercept[Exception]{
      P2.penultimate(List())
    }
  }
}