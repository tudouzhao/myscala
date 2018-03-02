package com.yuzhao.yang

object ArrayOperation {
  def main(args: Array[String]): Unit = {


    val lines = List("hello world", "hello tom hello jerry", "hello kitty")
    val linesResult = lines.flatMap(_.split(" "));
    linesResult.foreach(x => print(x + " "))
    val linesMap = linesResult.map(x => (x, 1))
    linesMap.foreach(x => println(x._1 + " num is " + x._2))
    println()
    println(linesMap.toString())
    val linesNewMap = linesMap.groupBy(_._1).mapValues(x => x.size)
    println(linesNewMap.toString())

    linesNewMap.map(x => (x._1 + "," + x._2))

    //    val set = Set(1,2,3,4,5)
    //
    //    val newSet = set.map(x => x*10)
    //    newSet.foreach(x => println(x))
    //
    //
    //    val value = set.filter( x => true)
    //    println(set.exists(x => x%2==0))
    //    val result = set.filter(x => x>2)
    //    println(result)
    //
    //
    //
    //    set.map(x=> println(x))
    //    val iterator = set.iterator
    //    iterator.foreach(x => println(x))
    //    iterator.map(x => println(x))

    //    println(value)
    //
    //    println(set.max)
    //    println(set.min)
    //
    //    val it = Iterator("baidu","tencent","taobao")
    //    it.foreach{
    //      it => println(it)
    //    }
    //    val colors1 = Map("red" -> "#ff00",
    //    "yellow"-> "#ff01",
    //    "green" -> "#ff10")
    //    colors1.keys.foreach{
    //      i => println(i)
    //    }
    //
    //    colors1.foreach{ i => println("key" + i._1)}
    //    colors1.foreach{
    //       i => println("key" + i._2)
    //    }
    //
    //    var myList = Array(1,2,3,4,5)
    //    for(x <- myList) {
    //      println((x: Int) => x + 1)
    //    }
    //    var sum = 0 ;
    //    for(x <- myList){
    //      sum = sum + x
    //    }
    //    println(sum)
  }
}

object InnerArray {
  val array = new Array[String](3)
  array(0) = "first"
  array(1) = "second"
  array(2) = "third"

  var newArray = Array(1, 2, 3)

  def main(args: Array[String]): Unit = {
    println(array(0))
    println(newArray(0))
    val iterator = array.iterator
    iterator.foreach(x => println(x))
    iterator.map(x => println(x))
    array.map(x => println(x))
  }
}
