package 過去問精選10問

object ABC088BCardGameforTwo {
  def run(): String = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val aList = Seq.fill(n)(sc.nextInt()).sorted.reverse

    val alice = aList.zipWithIndex.filter(t => t._2 % 2 == 0).map(t => t._1).sum
    val bob = aList.zipWithIndex.filter(t => t._2 % 2 != 0).map(t => t._1).sum
    (alice - bob).toString
  }
}
