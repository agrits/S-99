package com.github.agrits.s99

object P32{
  def gcd(k: Int, l: Int) : Int = if(l==0) k else gcd(l, k%l)
}