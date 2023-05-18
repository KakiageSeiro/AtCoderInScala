package 過去問精選10問

import org.scalatest.concurrent.TimeLimits
import org.scalatest.diagrams.Diagrams
import org.scalatest.flatspec.AnyFlatSpec

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets

class ABC081A_PlacingMarblesTest extends AnyFlatSpec with Diagrams with TimeLimits {

  private def input(str: String): Unit = {
    System.setIn(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)))
  }

  "問題ページの入力例" should "1" in {
    input("101")
    val result = ABC081A_PlacingMarbles.run()
    assert(result == "2")
  }

  "問題ページの入力例" should "2" in {
    input("000")
    val result = ABC081A_PlacingMarbles.run()
    assert(result == "0")
  }
}
