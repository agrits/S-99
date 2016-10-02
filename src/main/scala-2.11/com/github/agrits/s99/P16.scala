package com.github.agrits.s99

object P16{
  def drop(n: Int, l: List[Any]) : List[Any] = l.zipWithIndex.filter(_._2%3!=2).map(_._1)
}