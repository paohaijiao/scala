package com.helloworld.bean


/**
  * Created by Administrator on 2016/9/16.
  */
class Teacher private(val name:String,val age: Int) {//必须使用this(name:String,age:Int,gender:String)构造器
  println("this is primarry constructor")
  var gender:String=_;
  println(gender)
  def this(name:String,age:Int,gender:String){
    this(name,age)
    this.gender=gender
  }

}
class Teacher1() {
  var name:String=_
   private[this] var addr=""
  def this(name:String){
    this()
    this.name=name
  }

}
