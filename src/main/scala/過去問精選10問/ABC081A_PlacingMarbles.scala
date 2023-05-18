package 過去問精選10問

object ABC081A_PlacingMarbles {
  def run(): String = {
    val sc = new java.util.Scanner(System.in)
    val s = sc.next()

    s.toCharArray.toList.count(_ == '1').toString
    // s.count(_ == '1').toString String自体にもcount生えてた。一旦Charにして回す発想はJava的かもしれない。
  }
}
