package 過去問精選10問

object ABC086A_Product {
  def run(): String = {
    val sc = new java.util.Scanner(System.in)
    val a, b = sc.nextInt()
    val c = a * b
    if (c % 2 == 0) "Even" else "Odd"
  }
}
