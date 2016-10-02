package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P21Suite extends FunSuite{
  test("New element should be inserted at index #1"){
    assert(P21.insertAt('new, 1, List('a, 'b, 'c, 'd))==List('a, 'new, 'b, 'c, 'd))
  }
}