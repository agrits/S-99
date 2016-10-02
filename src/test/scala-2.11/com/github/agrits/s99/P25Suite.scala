package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P25Suite extends FunSuite{
  test("Returned list should contain same amount of elemnents as given list"){
    val given = List('a, 'b, 'c, 'd, 'e, 'f)
    val randomPermute = P25.randomPermute(given)
    given.foreach(x => assert(randomPermute.contains(x)))
    assert(given.size==randomPermute.size)
  }
}