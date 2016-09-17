package com.helloworld.bean

/**
  * Created by Administrator on 2016/9/16.
  */
class Person1(val name:String,var age:Int) {
  println("The primarry constructor of Person")
  val school="BJU"
  def sleep="8 hours"
  override def toString= "I am Person1"

}
class Work (name:String,age:Int,val salary:Long) extends Person1(name,age){
  println("sub consturctor")
  override val school: String ="Spark"
  override def toString= "I am a Worker "+super.sleep//父类如果是抽象的可以不用override
}
object Test{
  def main(args: Array[String]): Unit = {
    val a=new Work("Spark",5,1000);
    println(a.school)
    println(a.salary)
    println(a.toString)
  }
}
