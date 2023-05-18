

object Main {
  def main(args: Array[String]): Unit = {
    println(run())
  }

  def run(): String = { // ■■■■■■■■■■■■■■■■■■■■■■■■■
    val sc = new java.util.Scanner(System.in)
    val n, a, b = sc.nextInt()

    val list = for {
      nn <- 1 to n
      nnn = nn.toString.map(_.asDigit).sum
      if a <= nnn && nnn <= b
    } yield nn

    list.sum.toString
  }
}
