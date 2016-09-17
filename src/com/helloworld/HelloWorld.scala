package com.helloworld

/**
  * Created by Administrator on 2016/9/15.
  */
object HelloWorld {
  def doWhile() ={
    var line="";
    do{
      line=readLine()
      println("Read:"+line)
    }while(line!="")
  }
  def looper(x:Long,y:Long):Long={
    var a=x
    var b=y
    while(a!=0){
      val temp=a
      a=b%a
      b=temp
    }
   b
  }
  def getMessage(n:Int): Unit ={
    try {
         val half=if(n%2==0) n/2 else throw new RuntimeException("N must be Event")
    }catch {
      case e:Exception=>println ("Exception")
    }finally {
      println();
    }
  }
  def main(args: Array[String]): Unit = {
   // printf("HelloWorld")
//    doWhile  //输入字符
//    //没参数可以不写
//println(looper(100,298))
    getMessage(101)
  }

}
