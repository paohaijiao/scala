package com.helloworld.bean

/**
  * Created by Administrator on 2016/9/16.
  */
object University {
  private var studentNo=0;
  def newStudentN0={
    studentNo+=1
    studentNo
  }


}
class University {
  val id=University.newStudentN0
  private var num=0
  def aClass(number:Int){
this.num=number;
  }


}