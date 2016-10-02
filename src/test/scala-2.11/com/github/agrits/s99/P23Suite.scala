package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P23Suite extends FunSuite{
  test("Chosen elements should differ and be in the list"){
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g)
    val selected = P23.randomSelect(3, list)
    assert(selected.distinct.size==3)
    selected.foreach(x=> assert(list.contains(x)))
  }
}