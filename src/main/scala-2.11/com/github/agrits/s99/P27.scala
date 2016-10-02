package com.github.agrits.s99

import P26.combinations

import scala.collection.mutable.ListBuffer
object P27{
  def group3[A](list : List[A]) : List[List[List[A]]] = {
    return for{
      x <- combinations(2, list)
      y <- combinations(3, list.diff(x))
      z <- combinations(4, list.diff(x:::y))
    } yield List(x, y, z)

  }
  def group(list : List[Int], set : List[Any]) : List[List[List[Any]]] = {
    val lb = new ListBuffer[List[List[Any]]]
    def iterate(list: List[Int], elements: List[Any], current: List[List[Any]]): Unit = {
      if (list.size != 0) combinations(list.head, elements).foreach(x => iterate(list.tail, elements.diff(x), x :: current))
      else lb += (elements :: current).tail.reverse
    }
    iterate(list, set, List())
    lb.toList
  }
}