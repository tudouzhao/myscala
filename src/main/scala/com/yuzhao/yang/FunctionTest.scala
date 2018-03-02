package com.yuzhao.yang

object FunctionTest {
  def main(args: Array[String]): Unit = {
    delayed(time())
    printInt(a = 7, b = 5)
    printString("first", "second", "last")

  }

  def time() = {
    println("获取时间，单位为秒!")
    System.nanoTime()
  }

  def delayed(t: => Long) = {
    println("在delay方法内部")
    println("参数:" + t)
    t
  }

  def printInt(a: Int, b: Int) = {
    println("Value of a : " + a);
    println("Value of b : " + b);
  }

  def printString(args: String*): Unit = {
    var i = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg)
      i += 1;
    }
  }


}
