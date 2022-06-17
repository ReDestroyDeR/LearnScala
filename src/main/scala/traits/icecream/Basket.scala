package ru.red
package traits.icecream

trait Basket extends IceCream {
  override def make(): String = super.make() + " -> in basket"
}
