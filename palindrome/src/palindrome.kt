/**
 *  Most compact code version
 *
 *  fun isExactPalindrome(s: String) = (s.toLowerCase == s.reversed().toLowerCase)
 *
 * This next way to write this methos is a bit more long winded, but really more readable
 * for a third developer or for myself after long time pasts.
 * I don't like compact code like this:
 *
 *
 * */

/*
    Most compact in more readable way

        fun isPalindrome( stringToCheck: String ) : Boolean {
        var result = false
        var reverseStringToCheck = ""

        reverseStringToCheck = stringToCheck.reversed()

        if( stringToCheck.toLowerCase() == reverseStringToCheck.toLowerCase() ){
            result = true
        }
        return result
        }
*/

/**
 *
 * Most efficent code version in term of time esecution time.
 * In the best case (No palindrome string) the loop ends at the first circle because the method processes only the first char.
 *In the worst case (palindrome string) the method processes only half string.
 *
 **/

fun isPalindrome( stringToCheck: String ) : Boolean {
    var charsToCheck: CharArray = stringToCheck.toCharArray()
    var i1 = 0
    var i2 = charsToCheck.count() -1

    while ( i2 > i1  ){
        if (charsToCheck[i1] != charsToCheck[i2]) {
            return false
        }
        ++i1
        --i2
    }
    return true

}

fun main( args: Array<String> ) {
    //My strings array to check
    val myStrings = arrayOf( "Rotor", "RotoR", "aNnA", "anna", "step on no pets", "Kotlin", "121", "Xanax", "xanax", "1 xanax 1", "1 xanax 2" )

    for ( oneString in myStrings ) {
        println("'$oneString' is ${ if ( isPalindrome( oneString ) ) "" else "not " }  palindrome" )
    }
    println()
}
