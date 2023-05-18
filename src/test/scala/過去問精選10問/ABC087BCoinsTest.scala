package 過去問精選10問

import org.scalatest.concurrent.TimeLimits
import org.scalatest.diagrams.Diagrams
import org.scalatest.flatspec.AnyFlatSpec

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets

class ABC087BCoinsTest extends AnyFlatSpec with Diagrams with TimeLimits {
  "問題ページの入力例" should "1" in {
    val s =
      """
      2
      2
      2
      100
    """

    val 期待値 = "2"

    input(s)
    val result = run()
    assert(result == 期待値)
  }

  "問題ページの入力例" should "2" in {
    val s =
      """
      5
      1
      0
      150
    """

    val 期待値 = "0"


    input(s)
    val result = run()
    assert(result == 期待値)
  }

  "問題ページの入力例" should "3" in {
    val s =
      """
      30
      40
      50
      6000
    """

    val 期待値 = "213"


    input(s)
    val result = run()
    assert(result == 期待値)
  }








  // 部品■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  private def input(str: String): Unit = {
    System.setIn(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)))
  }

  private def run(): String = {
    ABC087BCoins.run()
  }
}
