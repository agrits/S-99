package com.github.agrits.s99

object P25{
  import P23.randomSelect
  def randomPermute(l : List[Any]) : List[Any] = randomSelect(1, l.permutations.toList).head.asInstanceOf[List[Any]]
}