package ink.duo3.fontconverter.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toLowerCase

@Composable
fun SomethingMystical(text: String) {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    val locale = Locale.current
    val words = text.toLowerCase(locale).split(" ")
    var result = ""
    words.forEachIndexed { wordIndex, word ->
        word.forEachIndexed { letterIndex, c ->
            result += if (word.first() in vowels) {
                if (letterIndex % 2 == 0) {
                    c.uppercaseChar()
                } else {
                    c
                }
            } else {
                if (letterIndex % 2 == 1) {
                    c.uppercaseChar()
                } else {
                    c
                }
            }
        }
        if (wordIndex != words.lastIndex) {
            result += ' '
        }
    }

    StyledItemDisplay(tag = "Bruh", text = result)
}
