package app

object Solution extends App {
  def backwardsPrime(start: Long, nd: Long): Any = {
    val primeString = (start to nd).filter(x => isPrime(x.toInt) && isRPrime(x.toInt)).map(x => x.toString)
    primeString.filter(x => x.reverse != x).mkString(",")
  }

  def isPrime(n: Int) = Range(2, n-1).forall(n % _ != 0)
  def isRPrime(n: Int) = Range(2, n.toString.reverse.toInt - 1).forall(n.toString.reverse.toInt % _ != 0)

  println(backwardsPrime(1,31))
}