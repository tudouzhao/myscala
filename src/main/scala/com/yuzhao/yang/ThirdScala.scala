package com.yuzhao.yang

import java.util.Date

object ThirdScala {
  def main(args: Array[String]) {
    test()
    func("best", 10)
    func1(10, "best" +
      "")
    val returnValue = circle()
    println(returnValue)
    var a = 10;
    var b = 20;
    var c = 25;
    var d = 25;
    println("a + b = " + (a + b));
    println("a - b = " + (a - b));
    println("a * b = " + (a * b));
    println("b / a = " + (b / a));
    println("b % a = " + (b % a));
    println("c % a = " + (c % a));
  }

  def func1(a: Int, b: String): Int = {
    var index = 0
    while (index < a) {
      index += 1
      println(b)
    }
    return a
  }

  def test(): Unit = {
    var x = 10;

    if (x < 20) {
      println("x < 20");
    }
  }

  /**
    *
    * @param first
    * @param second
    * @Myview Unit here is alike to void in Java
    */
  def func(first: String, second: Int): Unit = {
    print(first)
    println(second)
  }

  def circle(): String = {
    val date = new Date()
    val dateString = date.toString
    dateString
  }
}
