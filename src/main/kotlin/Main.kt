import kotlin.system.exitProcess

val morseCodeMap = mapOf(
    'A' to ".-", 'B' to "-...", 'C' to "-.-.", 'D' to "-..", 'E' to ".", 'F' to "..-.",
    'G' to "--.", 'H' to "....", 'I' to "..", 'J' to ".---", 'K' to "-.-", 'L' to ".-..",
    'M' to "--", 'N' to "-.", 'O' to "---", 'P' to ".--.", 'Q' to "--.-", 'R' to ".-.",
    'S' to "...", 'T' to "-", 'U' to "..-", 'V' to "...-", 'W' to ".--", 'X' to "-..-",
    'Y' to "-.--", 'Z' to "--..",
    '1' to ".----", '2' to "..---", '3' to "...--", '4' to "....-", '5' to ".....",
    '6' to "-....", '7' to "--...", '8' to "---..", '9' to "----.", '0' to "-----",
    ' ' to "/"
)

fun morseToText(morseCode: String): String {
    val morseCodeList = morseCode.split(" ")
    val textList = morseCodeList.map { morseCodeMap.entries.find { entry -> entry.value == it }?.key ?: "" }
    return textList.joinToString("")
}

fun textToMorse(text: String): String {
    val upperCaseText = text.uppercase()
    val morseCodeList = upperCaseText.map {
        if (it == ' ') {
            "/"
        } else {
            morseCodeMap[it] ?: ""  // Use ?: to provide a default value for null
        }
    }
    return morseCodeList.joinToString(" ")
}

fun main() {

    while(true){
        println("Enter text or Morse code:")
        val input = readlnOrNull() ?: run {
            println("Error: Unable to read input.")
            exitProcess(1)
        }

        val translatedText = if (input.contains(".") || input.contains("-")) {
            morseToText(input)
        } else {
            textToMorse(input)
        }

        println("Translated: ${translatedText.lowercase()}")
    }

}

