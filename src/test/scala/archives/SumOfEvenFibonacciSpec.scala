package archives

import org.scalatest.{Matchers, WordSpec}

class SumOfEvenFibonacciSpec extends WordSpec with Matchers {

  "SumOfEvenFibonacci" should {
    "return x for sum of even fibonacci elements" in {
      SumOfEvenFibonacci.sumOfEvenFibonacciTermsBelow4Million should be(4613732)
    }
  }

}
