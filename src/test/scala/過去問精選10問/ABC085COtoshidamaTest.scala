package 過去問精選10問

import org.scalatest.concurrent.TimeLimits
import org.scalatest.diagrams.Diagrams
import org.scalatest.flatspec.AnyFlatSpec

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets

class ABC085COtoshidamaTest extends AnyFlatSpec with Diagrams with TimeLimits {
  val 問題1期待値 = "4 0 5"
  val 問題1input =
    """
    9 45000
    """
  // -----------------------------------------------------------------
  val 問題2期待値 = "-1 -1 -1"
  val 問題2input =
    """
    20 196000
    """
  // -----------------------------------------------------------------
  val 問題3期待値 = "14 27 959"
  val 問題3input =
    """
    1000 1234000
    """
  // -----------------------------------------------------------------




  "問題ページの入力例" should "1" in {
    input(問題1input)
    val result = run()
    assert(result == 問題1期待値)
  }

  "問題ページの入力例" should "2" in {
    input(問題2input)
    val result = run()
    assert(result == 問題2期待値)
  }

  "問題ページの入力例" should "3" in {
    input(問題3input)
    val result = run()
    assert(result == 問題3期待値)
  }








  // 部品■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
  private def input(str: String): Unit = {
    System.setIn(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)))
  }

  private def run(): String = {
    ABC085BKagamiMochi.run()
  }
}
