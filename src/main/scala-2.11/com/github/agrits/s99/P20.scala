package com.github.agrits.s99

object P20{
  def removeAt(n : Int, l : List[Any]) = (l.take(n):::l.drop(n+1), l(n))
}