package archives

/**
  * The prime factors of 13195 are 5, 7, 13 and 29.
  * What is the largest prime factor of the number 600851475143 ?
  */

object LargestPrimeFactor {

  def getLargestPrimeFactor(n: Long): Long = {
    var number = n
    var i = 2L
    while (i <= number) {
      if (number % i == 0) {
        number /= i
        i -= 1
      }
      i += 1
    }
    i
  }

  def main(args: Array[String]): Unit = {
    println(getLargestPrimeFactor(6))
    println(getLargestPrimeFactor(11))
    println(getLargestPrimeFactor(13195))
    println(getLargestPrimeFactor(600851475143L))
  }

}
