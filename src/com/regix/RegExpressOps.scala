package com.regix

/**
  * Created by Administrator on 2016/9/17.
  */
object RegExpressOps {
  def main(args: Array[String]): Unit = {
    val regex="""([0-9]+)[(a-z)+]""".r//三个"""表示原生不用转义 .r表示正则表达
    val numPattern="[0-9]+".r
    val numberPattern="""\s+[0-9]+\s+""".r
    for (matchString<-numPattern.findAllIn("99345 Scala,22998 Spark"))println(matchString)
println(numberPattern.findFirstMatchIn("99ss java,222 hadoop"))
    val numitemPattern="""([0-9]+) ([a-z]+)""".r//93459	spark
    val numitemPattern(num,item)="99 hadoop"
    val line="93459 spark"
    line match{
      case  numitemPattern(num,blog)=>println(num+"\t"+blog)//93459	spark
      case  _=>println("ohh....")
    }
  }
}
