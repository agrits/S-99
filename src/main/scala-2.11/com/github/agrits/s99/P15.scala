package com.github.agrits.s99

object P15{
  def duplicateN(n : Int, l : List[Any]) : List[Any] = l.flatMap(List.fill(n)(_))
}