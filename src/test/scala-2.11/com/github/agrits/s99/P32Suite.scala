package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P32Suite extends FunSuite{
  import P32.gcd
  test("Greatest common divisors should be appropriate"){
    assert(gcd(1,2)==1)
    assert(gcd(53, 98)==1)
    assert(gcd(54, 18)==18)
    assert(gcd(12, 15)==3)
  }
}