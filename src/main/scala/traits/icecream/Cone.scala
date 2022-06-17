package ru.red
package traits.icecream

trait Cone extends IceCream {
  override def make(): String = super.make() + " -> in cone"
}
