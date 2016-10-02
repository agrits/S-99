package com.github.agrits.s99

object P28{

  def lsort[A](list : List[List[A]]) : List[List[A]] = list.sortBy(_.size)

  def lsortFreq[A](list : List[List[A]]) : List[List[A]] = {
      def createFreqsMap[A](l: List[List[A]], freqs: Map[Int, Int]): Map[Int, Int] = l match {
        case x :: xs => createFreqsMap(xs, freqs.updated(x.size, freqs.getOrElse(x.size, 0) + 1))
        case Nil => freqs
      }
    val freqs = createFreqsMap(list, Map())
    list.sortBy(x => freqs(x.size))
  }
}