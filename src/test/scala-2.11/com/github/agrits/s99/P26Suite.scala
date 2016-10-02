package com.github.agrits.s99

import org.scalatest.FunSuite
 

class P26Suite extends FunSuite{

  import P26.combinations
  val result = combinations(3, (1 to 12).toList)

  def factorial(number : Int): Int ={
    def worker(n : Int, acc : Int) : Int = if(n==1) return acc else return worker(n-1, acc*n)
    worker(number, 1)
  }
  def countNumberOfCombinations(sizeOfCombination : Int, sizeOfTheList : Int) =
    factorial(sizeOfTheList)/(factorial(sizeOfCombination)*factorial(sizeOfTheList-sizeOfCombination))

  test("Function should return list with correct number of elements."){
    assert(result.size==countNumberOfCombinations(3, (1 to 12).toList.size))
  }
  test("Function should return list with no doubled combinations."){
    assert(result.map(x => x.sortBy(_.asInstanceOf[Int])).distinct.filter(_.size==3).size==countNumberOfCombinations(3, (1 to 12).toList.size))
  }
}