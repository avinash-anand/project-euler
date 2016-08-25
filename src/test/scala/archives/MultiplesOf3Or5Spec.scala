package archives

import org.scalatest.{Matchers, WordSpec}

class MultiplesOf3Or5Spec extends WordSpec with Matchers {

  "MultiplesOf3Or5" should {
    "return sum of multiples of 3 or 5 below 1000" in {
      MultiplesOf3Or5.getSumOfMultiplesOf3Or5Below1000 should be(233168)
    }
  }

}
