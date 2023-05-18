

object Main {
  def main(args: Array[String]): Unit = {
    println(run())
  }

  def run(): String = { // ■■■■■■■■■■■■■■■■■■■■■■■■■
    val sc = new java.util.Scanner(System.in)
    val n枚, y円 = sc.nextInt()

    val m_枚数タプルリスト = for {
      i10000 <- 0 to n枚
      i5000 <- 0 to n枚 - i10000
      i1000 = n枚 - i10000 - i5000
      if i10000 * 10000 + i5000 * 5000 + i1000 * 1000 == y円
    } yield (i10000, i5000, i1000)

    if (m_枚数タプルリスト.size == 0) return "-1 -1 -1"

    m_枚数タプルリスト(0)._1 + " " + m_枚数タプルリスト(0)._2 + " " + m_枚数タプルリスト(0)._3
  }
}
