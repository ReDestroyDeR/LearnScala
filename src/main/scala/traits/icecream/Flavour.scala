package ru.red
package traits.icecream

trait Flavour extends IceCream {
  override def make(): String = super.make() + " -> with flavour"
}
