package com.asn.framework.util

import org.apache.spark.SparkContext

object EnvUtil {

  private val scLocal = new ThreadLocal[SparkContext]

  def put(sc : SparkContext)={
    scLocal.set(sc)
  }

  def take():SparkContext={
    scLocal.get()
  }

  def clear()={
    scLocal.remove()
  }
}
