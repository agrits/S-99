package com.github.agrits.s99

object P11{
  import P10.encode
  def encodeModified(l : List[Any]) : List[Any] = encode(l).map(el => if(el._1==1) el._2 else el)

}