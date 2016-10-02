package com.github.agrits.s99

object P13{
  def encodeDirect(l : List[Any]) : List[(Int, Any)] = {
    def worker(list : List[Any], tempList : List[(Int, Any)]) : List[(Int, Any)] = list match {
      case x::xs => worker(xs.dropWhile(_==x), (list.takeWhile(_==x).size, x)::tempList)
      case Nil => tempList
    }
    worker(l, Nil).reverse
  }
}