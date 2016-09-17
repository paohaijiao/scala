package com.helloworld

/**
  * Created by Administrator on 2016/9/16.
  */
//AOP
trait Action {
def doAction
}
trait  TBeforeAction extends Action{
  abstract override def  doAction: Unit ={
    println("Initials")
    super.doAction
    println("after")
  }
}
class Work extends Action{
  override def  doAction=println("Working")
}
