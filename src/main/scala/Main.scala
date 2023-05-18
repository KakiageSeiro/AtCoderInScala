

object Main {
  def main(args: Array[String]): Unit = {
    println(run())
  }

  def run(): String = { // ■■■■■■■■■■■■■■■■■■■■■■■■■
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val list = Seq.fill(n)(sc.nextInt())

    go(list.toList, 0).toString
  }

  def go(list: List[Int], count: Int): Int = {
    if (list.exists(_ % 2 != 0)) return count

    go(list.map(_ / 2), count + 1)
  }
}