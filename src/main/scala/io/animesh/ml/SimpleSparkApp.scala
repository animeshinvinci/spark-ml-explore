package io.animesh.ml

import org.apache.spark.sql.SparkSession
import scala.collection.mutable


object  SimpleSparkApp extends App {

  val session = SparkSession.builder().master("local[2]").appName("aa").getOrCreate()
  val data = session.sqlContext.read.json("/Users/anvika/Downloads/")


}
