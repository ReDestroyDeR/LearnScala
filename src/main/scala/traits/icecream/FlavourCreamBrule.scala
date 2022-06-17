package ru.red
package traits.icecream

trait FlavourCreamBrule extends Flavour {
  override def make(): String = super.make() + " -> cream brule"
}
