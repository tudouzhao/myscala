package com.yuzhao.yang

object FouthScala {
  def main(args: Array[String]): Unit = {
    Test.addInt()
    for (i <- 0 to 10) {
      println(i + " 的阶乘为" + factorial(i))
    }
  }

  def factorial(i: Int): Int = {
    if (i < 1)
      return 1
    else
      return factorial(i - 1) * i;
  }
}

case object Test {
  def main(args: Array[String]): Unit = {
    println("返回值" + addInt())
  }

  def addInt(a: Int = 5, b: Int = 7) = {
    var sum = 0;
    sum = a + b;
    println(sum)
    sum
  }
}