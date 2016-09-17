package com.helloworld

/**
  * Created by Administrator on 2016/9/16.
  */
class MutilExtends {


}
class Human{
  println("Human")
}
trait TTeacher extends Human{
  println("TTeacher")
  def teach
}
trait PianoPlayer extends Human{
  println("PianoPlayer")
  def pianoPlayer={
    println("I'm playing piano")
  }
}
class PianoTeacher extends Human with TTeacher with PianoPlayer{
  override def teach ={
    println("I'm training student")
  }
}
object MutilExtendsTest{
  def main(args: Array[String]): Unit = {
    val t1=new PianoTeacher();
    t1.teach
    t1.pianoPlayer

    val t2=new Human with TTeacher with PianoPlayer{
      override def teach ={
        println("I'm teach student")
      }
    }
    t2.teach
    t2.pianoPlayer
  }
}

