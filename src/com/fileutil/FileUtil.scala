package com.fileutil

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * Created by Administrator on 2016/9/17.
  */
class FileUtil {
  def test(): Unit = {
    val writer=new PrintWriter(new File("E:\\config1.ini"))
    for(i<-1 until 100)writer.println(i)
  }
}
object FileUtil{
  def main(args: Array[String]): Unit = {
    val file=Source.fromFile("E:\\config.ini")
    for(line<-file.getLines())println(line)
    //test
  }
}
