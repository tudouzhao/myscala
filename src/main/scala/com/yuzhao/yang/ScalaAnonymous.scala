package com.yuzhao.yang

object ScalaAnonymous {
  def main(args: Array[String]): Unit = {
    println(add2(7) - 1)
    println(secondAdd(1, 2))
  }

  def add2 = new Function[Int, Int] {
    def apply(x: Int): Int = x + 1
  }

  var inc = (x: Int) => x + 1

  var secondAdd = (x: Int, y: Int) => x + y

  println(inc(7))
}

object AnotherTest {
  def main(args: Array[String]): Unit = {
    test(7)
  }

  var test = (x: Int) => println(x + 1)
}
