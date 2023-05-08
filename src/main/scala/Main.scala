

object Main {
  def main(args: Array[String]): Unit = {
    // println(ABC086A_Product.run())
    println(run())
  }

  def run(): String = {
    val sc = new java.util.Scanner(System.in)
    val a, b = sc.nextInt()
    val c = a * b
    if (c % 2 == 0) "Even" else "Odd"
  }
}