

object Main {
  def main(args: Array[String]): Unit = {
    println(run())
  }

  def run(): String = { // ■■■■■■■■■■■■■■■■■■■■■■■■■
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val dList = Seq.fill(n)(sc.nextInt()).distinct
    dList.size.toString
  }
}
