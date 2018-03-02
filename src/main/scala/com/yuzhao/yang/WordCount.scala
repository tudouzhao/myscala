package com.yuzhao.yang

import org.apache.spark.{SparkContext, SparkConf}

object WordCount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("WordCount")
    conf.setMaster("local[4]")
    val sc = new SparkContext(conf)


    //读取本地文件的办法，必须用这种办法进行读取才行
    val interEle = sc.textFile("test/*", 2)
    val newRdd = interEle.flatMap(_.split(" ")).map(x => (x, 1)).reduceByKey(_ + _).sortBy(_._2, false)
    newRdd.saveAsTextFile("hdfs://192.168.100.122:9000/result")
    //接下来是文件的保存

  }
}
