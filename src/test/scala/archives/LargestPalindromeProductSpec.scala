package archives

import org.scalatest.{Matchers, WordSpec}

class LargestPalindromeProductSpec extends WordSpec with Matchers {

  "LargestPalindromeProduct" should {
    "return largest palindrome of product of n=2 digit numbers" in {
      LargestPalindromeProduct.findLargestPalindromeProduct(2) should be(9009)
    }
    "return largest palindrome of product of n=3 digit numbers" in {
      LargestPalindromeProduct.findLargestPalindromeProduct(3) should be(906609)
    }
  }

}
