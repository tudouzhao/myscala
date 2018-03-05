package com.yuzhao.yang.basic

import scala.util.Random


object CaseDemo01 {
  def main(args: Array[String]): Unit = {
    val arr = Array("first", "second", "third")
    val name = arr(Random.nextInt(arr.length))
    println(name)
    name match {
      case "first" => println("first student")
      case "second" => println("second smaller student")
      case "third" => println("third smallest student")
    }
  }
}
