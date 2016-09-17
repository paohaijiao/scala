package com.helloworld

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Administrator on 2016/9/15.
  */
object ArrayTest {

  def main(args: Array[String]): Unit = {
    val num=new Array[Int](10)
    val a=new Array[String](10)
    val s=Array("hello","world")
    s(0)="GOOD BYE"
    for(elem<-s) println(elem)

    val b=ArrayBuffer[Int]()//缓存数组可变
    b+=1
    b+=(1,2,3,5)
    b++=Array(8,13,21) ////////////////
    b
    b.trimEnd(5)//后面切除元素
    b.insert(2,6)//第二个位置插入6
    b
    b.insert(2,7,8,9)//2的位置插入7,8,9
    b
    b.remove(2)//山粗索引2
    b.remove(2,3)//从索引为2的位置删除三个元素
    val c=b.toArray//不能修改了


    val d=Array(2,3,7,11)
    val result=for(elem<-d) yield 2*elem
    for(elem<-d if elem%2==0) yield 2*elem
    d.filter(_%2==0).map(2*_)

    Array(1,7,2,9).sum
    ArrayBuffer ("Marry","had","a","little","lamb").max
    val e= Array(1,7,2,9).sorted
    val f= Array(1,7,2,9)
    scala.util.Sorting.quickSort(f)
    f.mkString(" and ")
    f.mkString(" and ")

    val metric=Array.ofDim[Double](3,4)
    metric(2)(1)=42
    val triangel=new Array[Array[Int]](10)
    for(i<-0 until triangel.length){
      triangel(i)=new Array[Int](i+1)

    }






  }

}
