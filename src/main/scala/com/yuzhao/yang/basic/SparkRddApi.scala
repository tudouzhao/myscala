package com.yuzhao.yang.basic

import org.apache.spark.{SparkConf, SparkContext}

object SparkRddApi {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext(new SparkConf().setAppName("rddApiTest") setMaster ("local[4]"))
    //    val rdd1 = sc.parallelize(1 to 10, 10)
    //    val rdd2 = rdd1.reduce(_+_)
    //    println(rdd2.toString)

    //    val rdd1 = sc.parallelize(List(("first"->1),"second"->2,"third"->3))
    //    val rdd2 = rdd1.filter(x => x._1.equals("first"))
    //    rdd2.foreach(x => println(x._2))

    //    val rdd1 = sc.parallelize(List("I am a good student",
    //      "he is a bad student","All of us are facing dangers"))
    //    val rdd2 = rdd1.flatMap(_.split(" "))
    //    println(rdd2.count())
    //    rdd2.foreach(x => println(x))
    //    val rdd1 = sc.parallelize(List(1,2,3,4,5,6),2)
    //    val rdd2 = rdd1.mapPartitions(x => x.map(x => x+ 10))
    //    println(rdd1.partitions.length)
    //    println(rdd2.partitions.length)
    //    rdd1.foreachPartition(x => println(x.sum))
    //    rdd2.foreachPartition(x => println(x.sum))

    val rdd1 = sc.parallelize(List(1, 2, 3, 4, 5, 2, 3, 9), 2)

    rdd1.sample(withReplacement = false, 0.5, System.currentTimeMillis)
      .foreach(println)

    //    val fun = (x:Int,y:Iterator[(Int)]) =>{
    //      y.toList.map(z => "[partID" + x +",val:" + z +"]").iterator
    //    }
    //    val rdd5 = rdd1.mapPartitionsWithIndex(fun)
    //    rdd5.foreach(x => println(x))


    //    val rdd4 = rdd1.distinct()
    //    rdd4.foreach(x => println(x))
    //
    //    val rdd5 = rdd1.distinct(2)
    //    println(rdd5.partitions.length)
    //    rdd5.foreachPartition(x => println(x.sum))
  }
}
