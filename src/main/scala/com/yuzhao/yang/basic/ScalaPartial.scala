package com.yuzhao.yang.basic

import java.util.Date

object ScalaPartial {
  def main(args: Array[String]): Unit = {
    val date = new Date()

    log(date, "message1")
    Thread.sleep(
      1000
    )
    log(date, "message2")

    Thread.sleep(1000)
    log(date, "message3")

    val logWithDateBound = log(date, _: String)
    logWithDateBound("test")

  }

  val log = (date: Date, message: String) => println(date + "----" + message)
}
