package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P17Suite extends FunSuite{
  test("List should be splitted on third position"){
    assert(P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))==(List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}