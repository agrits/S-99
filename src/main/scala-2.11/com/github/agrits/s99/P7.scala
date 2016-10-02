package com.github.agrits.s99

import scala.collection.GenTraversableOnce

object P7{
  def flatten(l : List[Any]) : List[Any]= l flatMap{
      case la : List[Any] => flatten(la)
      case el => List(el)
  }
}