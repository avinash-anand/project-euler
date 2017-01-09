package archives

object LargestPalindromeProduct {

  def findLargestPalindromeProduct(digits: Int): Int = {
    if(digits > 5) throw new UnsupportedOperationException("digits above 5 not supported")
    else {
      val largestOfNoOfDigits = ("9" * digits).toInt
      val smallestOfNoOfDigits = (1 + "0" * (digits - 1)).toInt
      println(s"largest - $largestOfNoOfDigits & smallest - $smallestOfNoOfDigits")
      var product = 0
      for(i <- largestOfNoOfDigits to smallestOfNoOfDigits by -1) {
        for (j <- i to smallestOfNoOfDigits by -1) {
          val prod = i*j
          if(isPalindrome(prod)) {
            product = larger(prod, product)
          }
        }
      }
      product
    }
  }

  def isPalindrome(number: Int): Boolean = number.toString.reverse == number.toString

  def larger(a: Int, b: Int): Int = if(a > b) a else b

  def main(args: Array[String]): Unit = {
    println(findLargestPalindromeProduct(2))
    println(findLargestPalindromeProduct(3))
  }

}
