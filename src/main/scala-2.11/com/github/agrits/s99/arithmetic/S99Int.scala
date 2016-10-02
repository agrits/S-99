package com.github.agrits.s99.arithmetic

/**
  * Created by grits on 28.08.16.
  */
  class S99Int(val i: Int) {
  import S99Int._
    //P31
    def isPrime: Boolean = i match {
      case 1 => false
      case _ => !Stream.range(2, i).exists(i % _ == 0)
    }

  }
  object S99Int {
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)
  }