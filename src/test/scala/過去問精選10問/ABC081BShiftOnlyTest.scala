package 過去問精選10問

import org.scalatest.concurrent.TimeLimits
import org.scalatest.diagrams.Diagrams
import org.scalatest.flatspec.AnyFlatSpec

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets

class ABC081BShiftOnlyTest extends AnyFlatSpec with Diagrams with TimeLimits {

  private def input(str: String): Unit = {
    System.setIn(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)))
  }

  "問題ページの入力例" should "1" in {
    val s =
      """
      3
      8 12 40
    """
    input(s)

    val result = ABC081BShiftOnly.run()

    assert(result == "2")
  }

  "問題ページの入力例" should "2" in {
    val s =
      """
      4
      5 6 8 10
    """
    input(s)

    val result = ABC081BShiftOnly.run()

    assert(result == "0")
  }

  "問題ページの入力例" should "3" in {
    val s =
      """
      6
      382253568 723152896 37802240 379425024 404894720 471526144
    """
    input(s)

    val result = ABC081BShiftOnly.run()

    assert(result == "8")
  }
}
