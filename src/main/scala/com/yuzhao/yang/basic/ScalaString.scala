package com.yuzhao.yang.basic

object ScalaString {

  val greeting = "Hello ,world!"
  val name = "I am coming!"

  def main(args: Array[String]): Unit = {
    println(greeting)
    println(greeting.length)
    println(greeting.concat(name))
  }
}
