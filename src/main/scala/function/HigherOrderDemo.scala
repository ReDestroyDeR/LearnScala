package ru.red
package function

import scala.reflect.ClassTag

object HigherOrderDemo {

  def mapReduce[A, B: ClassTag](array: Array[A], mapper: A => B, reduce: (B, B) => B): Option[B] = {
    if (array.length == 0)
      return None

    var reduced: B = mapper(array(0))
    for (index <- 1 until array.length) {
      reduced = reduce(reduced, mapper(array(index)))
    }

    Some(reduced)
  }
}
