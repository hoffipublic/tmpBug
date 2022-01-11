import com.hoffi.mpp.common.io.json.StringUtils

fun main() {
    println("example json:")
    println(jsonString)
    println()
    println("collapsed:")
    println(StringUtils.collapseParentheses(jsonString))
}

const val jsonString = """{
  "accounting": [
    {
      "firstName": "s2",
      "lastName": "s2",
      "age": 23
    },
    {
      "firstName": "t2",
      "lastName": "t2",
      "age": 32
    }
  ],
  "sales": [
    {
      "firstName": "u2",
      "lastName": "u2",
      "age": 27
    },
    {
      "firstName": "v2",
      "lastName": "v2",
      "age": 41
    }
  ]
}
"""
