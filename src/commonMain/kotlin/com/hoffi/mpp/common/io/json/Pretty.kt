package com.hoffi.mpp.common.io.json

//const val RElinebreak = "\\R"
const val REParOpen = "[{(\\[]"
const val REParClos = "[})\\]]"
val RECombineParsOpen = Regex("(?<=$REParOpen)\\s*\\R\\s*(?=$REParOpen)", RegexOption.MULTILINE)
val RECombineParsClos = Regex("(?<=$REParClos)\\s*\\R\\s*(?=$REParClos)", RegexOption.MULTILINE)
val RECompressCurlies = Regex("},\\s*\\R\\s+\\{", RegexOption.MULTILINE)

object Pretty {
    fun collapseParentheses(jsonString: String): String {
        var s = jsonString
        s = s.replace(RECombineParsOpen, "") // combine opening parenthesises on separate lines
        s = s.replace(RECombineParsClos, "") // same on closing ones
        s = s.replace(RECompressCurlies, "},{")
        return s
    }
}
