package 過去問精選10問

object ABC086CTraveling {
  def run(): String = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val plans = List.fill(n) {
      val t時間, x, y = sc.nextInt()
      (t時間, x, y)
    }

    val start = (0, 0, 0)
    val is実行可能: Boolean = (start :: plans).zip(plans).forall { case (c_現在, n_次) =>
      val 残り時間 = n_次._1 - c_現在._1
      val 距離 = Math.abs(n_次._2 - c_現在._2) + Math.abs(n_次._3 - c_現在._3)

      val 時間が足りる = 残り時間 >= 距離
      val 時間を潰せる = (残り時間 % 2) == (距離 % 2)
      時間が足りる && 時間を潰せる
    }

    if (is実行可能) {
      "Yes"
    } else {
      "No"
    }
  }
}