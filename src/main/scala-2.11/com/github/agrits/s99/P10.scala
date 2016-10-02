package com.github.agrits.s99

object P10{
  import P9.pack
  def encode[A](l : List[A]) : List[(Int,A)] = pack(l).map(el => (el.size, el.head))
}