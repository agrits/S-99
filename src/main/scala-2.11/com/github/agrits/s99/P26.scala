package com.github.agrits.s99

import scala.collection.mutable.ListBuffer

object P26{
  def combinations[A](number : Int, list : List[A]) : List[List[A]] = {
    if(number==list.size) return List(list)
    else {
      val lb = new ListBuffer[List[A]]
      def iterate(available: List[A], depth: Int, maxDepth: Int, current: List[A]): Unit = {
        var av = available
        if (depth != maxDepth) av.foreach(x => {
          iterate(av.tail, depth + 1, maxDepth, x :: current); av = av.tail
        })
        else if (current.length == number) lb += current
      }

      iterate(list, 0, number, List())
      lb.toList
    }
  }
}