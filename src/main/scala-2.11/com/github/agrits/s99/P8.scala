package com.github.agrits.s99

object P8{
  def compress(l : List[Any]): List[Any] ={
    def worker(list : List[Any], tempList : List[Any]) : List[Any]= list match {
      case x::xs => worker(xs.dropWhile(_==x), x::tempList)
      case Nil => tempList
    }
    worker(l, Nil).reverse
  }
}