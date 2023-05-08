package 過去問精選10問

import org.scalatest.concurrent.TimeLimits
import org.scalatest.diagrams.Diagrams
import org.scalatest.flatspec.AnyFlatSpec

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets

class ABC086A_ProductTest extends AnyFlatSpec with Diagrams with TimeLimits {

  private def input(str: String): Unit = {
    System.setIn(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)))
  }

  "ABC086A_Product" should "偶数" in {
    input("3 4")
    val result = ABC086A_Product.run()
    assert(result == "Even")
  }

  "ABC086A_Product" should "奇数" in {
    input("3 3")
    val result = ABC086A_Product.run()
    assert(result == "Odd")
  }
}
