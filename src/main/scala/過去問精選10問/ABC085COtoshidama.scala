package 過去問精選10問

object ABC085COtoshidama {
  def run(): String = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val dList = Seq.fill(n)(sc.nextInt()).distinct
    dList.size.toString
  }
}
