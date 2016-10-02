package com.github.agrits.s99

object P12 {

  def decode(l: List[(Int, Any)]): List[Any] = l.flatMap(x => List.fill(x._1)(x._2))
}