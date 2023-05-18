package 過去問精選10問

object ABC049CDaydream {
  def run(): String = {
    val sc = new java.util.Scanner(System.in)
    val s = sc.next().reverse

    // eraserdream は eraser dreamが正しいが、eraseもマッチしてしまう
    // これはマッチする単語が2種存在することで起こってしまう。逆順にするとこれがなくなる。
    val dream = "maerd"
    val dreamer = "remaerd"
    val erase = "esare"
    val eraser = "resare"

    def go(ss: String): Boolean = {
      if (ss.isEmpty) return true
      if (0 >= ss.length) return false

      // 文字列を連結して次のループに渡すようにすると実行時間超過になるので、sを削っていく
      if (ss.startsWith(eraser))  return go(ss.drop(eraser.length))
      if (ss.startsWith(erase))  return go(ss.drop(erase.length))
      if (ss.startsWith(dreamer))  return go(ss.drop(dreamer.length))
      if (ss.startsWith(dream))  return go(ss.drop(dream.length))

      false
    }

    if (go(s)) {
      "YES"
    } else {
      "NO"
    }
  }
}
