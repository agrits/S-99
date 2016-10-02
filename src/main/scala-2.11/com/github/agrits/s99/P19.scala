package com.github.agrits.s99

object P19{
  import P7.flatten
  def rotate(n : Int, l : List[Any]) = if(n<0) l.takeRight(n*(-1)):::l.dropRight(n*(-1)) else l.drop(n):::l.take(n)
}