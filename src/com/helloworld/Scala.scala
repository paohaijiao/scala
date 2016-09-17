package com.helloworld

import com.helloworld.bean.{Person, Student}

/**
  * Created by Administrator on 2016/9/16.
  */
object Scala {

  def main(args: Array[String]): Unit = {
    val p=new Person()
    p.increment()
    println(p.current)
    val student=new Student()
    student.age=10
    println(student.age)
  }

}
