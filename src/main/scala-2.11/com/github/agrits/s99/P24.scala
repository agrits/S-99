package com.github.agrits.s99

import scala.util.Random

object P24{
  import P23.randomSelect
  def lotto(n : Int, m : Int) : List[Int] = randomSelect(n, (1 to m).toList).asInstanceOf[List[Int]]
}