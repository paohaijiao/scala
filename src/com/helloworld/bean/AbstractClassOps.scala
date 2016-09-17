package com.helloworld.bean

/**
  * Created by Administrator on 2016/9/16.
  */
class AbstractClassOps {
var id:Int=_
}
abstract class SuperTeacher(val name:String){
  var id:Int
  var age:Int
  def teach
}
class TeacherForMath(name:String) extends SuperTeacher(name){
  override var id: Int =name.hashCode
  override var age: Int =28

  override def teach(): Unit ={
    println("Teaching")
  }
}

object AbstractClassOps{
  def main(args: Array[String]): Unit = {
    val teache=new TeacherForMath("Spark")
    teache.teach()
    println(teache.id);
    println(teache.age);


  }
}
