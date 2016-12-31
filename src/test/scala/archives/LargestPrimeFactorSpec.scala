package archives

import org.scalatest.{Matchers, WordSpec}

class LargestPrimeFactorSpec extends WordSpec with Matchers {

  "LargestPrimeFactor" should {
    "return largest prime factor of given number" in {
      LargestPrimeFactor.getLargestPrimeFactor(2) should be(2)
      LargestPrimeFactor.getLargestPrimeFactor(13195) should be(29)
      LargestPrimeFactor.getLargestPrimeFactor(600851475143L) should be(6857)
    }
  }

}
