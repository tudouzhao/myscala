package com.yuzhao.yang

object SixScala {
  def main(args: Array[String]): Unit = {
    println(apply(layout, 10))
    firstPrint()
  }

  def firstPrint() = {
    val first = List(1, 2, 3, 4, 5)
    for (ele <- first) {
      print(ele)
    }
  }

  def apply(f: Int => String, i: Int) = f(i)

  def layout[A](x: A) = "[" + x.toString() + "]"
}
