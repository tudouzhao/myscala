package com.yuzhao.yang.basic

object ScalaTuple {
  def main(args: Array[String]): Unit = {
    val first = (1, "first", "yangyuzhao")
    println(first._1)
    println(first._2)
    println(first._3)
    println(first.getClass.getName)
    first.productIterator.foreach(x => println(x))
    println(first.toString())
  }
}
