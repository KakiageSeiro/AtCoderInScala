package 過去問精選10問

object ABC087BCoins {
  def run(): String = {
    val sc = new java.util.Scanner(System.in)
    val a500, b100, c50, x円 = sc.nextInt()

    val list = for {
      a <- 0 to a500
      b <- 0 to b100
      c <- 0 to c50
      if a * 500 + b * 100 + c * 50 == x円
    } yield (a, b, c)

    list.size.toString
  }
}
