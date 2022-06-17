package ru.red
package traits.icecream

trait FlavourStrawberry extends Flavour {
  override def make(): String = super.make() + " -> strawberry"
}
