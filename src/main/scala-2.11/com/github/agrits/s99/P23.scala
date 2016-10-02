package com.github.agrits.s99

import scala.util.Random

object P23{
  def randomSelect(n : Int, l : List[Any]): List[Any] = new Random().shuffle(l).take(n)
}