package com.helloworld.bean

/**
  * Created by Administrator on 2016/9/16.
  */
trait Logger {
  def log(msg:String){}
}
class ConcretLogger extends Logger{
// override def log(msg:String): Unit ={
//
//  }
  def concreteLog ={
log("it's me")
}
  trait TraitLogger extends Logger{
    override def log(msg: String): Unit ={
      println("the trait Loger content is"+msg)
    }
  }
  object testLogger{
    def main(args: Array[String]): Unit = {
      val t=new ConcretLogger with TraitLogger
      t.concreteLog
    }
  }
}
