package com.helloworld

/**
  * Created by Administrator on 2016/9/16.
  */
object Map_Tuple {


  def main(args: Array[String]): Unit = {
    val map=Map("book"->10,"gun"->18,"ipad"->1000)
    for((k,v)<-map)yield (k,v*0.9)
    val scores=scala.collection.mutable.Map("scala"->7,"hadooop"->8,"spark"->10)
    val hadoopscore=scores.getOrElse("hadoop",0)//如果有这个key ，没有的话就返回第二个的值0
    scores+=("R"->9)
    scores-="hadooop"
    val sortedScore=scala.collection.immutable.SortedMap("scala"->7,"hadooop"->8,"spark"->10)
    val tuple=(1,2,3.14,"Rockie","spark")
    val third=tuple._3
    val(first,second,thirda,fourth,five)=tuple
    val(f,s,_,_,_)=tuple
    "Rocky Spark".partition(_.isUpper)
    val symbol=Array("[",",","]")
    val counts=Array(2,5,2)// [2,",5","]2"
    val pair=symbol.zip(counts)
    for((k,v)<-pair)print(k*v)
  }

}
