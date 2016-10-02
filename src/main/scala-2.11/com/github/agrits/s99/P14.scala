package com.github.agrits.s99

object P14{
  import P7.flatten
  def duplicate(l : List[Any]) : List[Any] = flatten(l.map(x=>List(x, x)))
}