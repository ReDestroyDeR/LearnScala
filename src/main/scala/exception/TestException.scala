package ru.red
package exception

class TestException(private val message: String) extends RuntimeException {
  override def getMessage: String = message
}
