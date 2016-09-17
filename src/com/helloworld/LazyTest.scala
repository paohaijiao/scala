package com.helloworld

/**
  * Created by Administrator on 2016/9/15.
  */
object LazyTest {
  def forEnhence(): Unit ={
    for (i<- 1 to 2;j<- 1 to 2 if i!=j){//加了条件表达式
      printf(100*i+j+"")

    }
  }
  def addA(x:Int)=x+100
  val add=(x:Int)=>x+200//匿名函数
  def fact(x:Int):Int=if(x<=0) 1 else x*fact(x-1)//递归调用必须指定返回值，不然不知道是什么值
  def connected(args:Int*)={
    var result=0
    for(arg<-args) result+=arg
    result
  }
  def main(args: Array[String]): Unit = {
    forEnhence
    println(addA(2))
    println(add(2))
    println(connected(1,2,3,4,5,6))
  }
}
