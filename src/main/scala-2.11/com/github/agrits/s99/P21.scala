package com.github.agrits.s99

object P21{
  def insertAt(el : Any, index : Int, l: List[Any]) = l.take(index):::(el::l.drop(index))
}