package com.helloworld

import scala.io.Source


/**
  * Created by Administrator on 2016/9/15.
  */
object Test {
   def getTuple():Unit={
     val pair=("hello","world",1)
     println(pair._1+pair._2+pair._3)
   }
  def getArray():Unit={
    val array=Array(1,2,3,4,5);
   for(i<- 0 until array.length ){
     println(array(i))
   }
  }
  def getMap():Unit={
    val ages=Map("Rocky"->27,"Devel"->28)
  for((k,v)<-ages){
    printf("Key is"+k+"Value is"+v)
  }
    for((k,_)<-ages){//只是占位符
      printf("Key is"+k)
    }

  }
  def getFile(): Unit ={
    val file=Source.fromFile("E:\\config.ini")
    for(line<-file.getLines()){
      println(line)

    }
  }
  def main(args: Array[String]): Unit = {
    getFile
   lazy val file=Source.fromFile("E:\\config.ini")//只有在第一次被使用的时候才会被实例化
    for(line<-file.getLines()){
      println(line)

    }
  }

}
