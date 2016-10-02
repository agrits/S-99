package com.github.agrits.s99

object P9{
  def pack[A](l : List[A]) : List[List[A]] = {
    def worker(list : List[A], tempList : List[List[A]]) : List[List[A]]=list match {
      case x::xs => worker(xs.dropWhile(_==x), (list.takeWhile(_==x))::tempList)
      case Nil => tempList
    }
    worker(l, Nil).reverse
  }
}