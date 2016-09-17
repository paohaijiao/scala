package com.helloworld.bean

/**
  * Created by Administrator on 2016/9/16.
  */
class ApplyTest {
  def apply()=println("I'm into spark so much")
  def haveAtry: Unit ={
    println("have a try on apply")
  }

}
object ApplyTest {
  def apply()={
    println("I'm into spark so much")
    new ApplyTest
  }
object ApplyApplication{
  val a=ApplyTest()
  a.haveAtry
  val b=new ApplyTest()
  b.haveAtry
}

}
