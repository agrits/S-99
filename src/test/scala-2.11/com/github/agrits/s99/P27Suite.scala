package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P27Suite extends FunSuite{
  def factorial(n : Int) : Int = {
    def worker(number : Int, acc : Int) : Int = if(number==1) acc else worker(number-1, acc*number)
    worker(n, 1)
  }
  def C(toPick : Int, setSize : Int) : Int = {
    factorial(setSize)/(factorial(toPick)*factorial(setSize-toPick))
  }
  val set =  List('a, 'b, 'c, 'd, 'e, 'f)
  val sizes = List(2, 2, 2)
  val result = P27.group(sizes, set)
  val apropSize = C(2, 6)*C(2, 4)
  test("Combinations should be unique."){
    assert(result.distinct.size==apropSize)
  }
  test("List should have appropriate size."){
    assert(result.size==apropSize)
  }
  test("Elements of list should have appropriate size."){
    assert(!result.exists(_.exists(_.size!=2)))
  }
}
