import kotlinx.css.*
import styled.StyleSheet

object WelcomeStyles : StyleSheet("WelcomeStyles", isStatic = true) {
    val textContainer by css {
        padding(5.px)

        backgroundColor = rgb(128, 97, 22)
        color = rgb(56, 216, 37)
    }

    val textInput by css {
        margin(vertical = 5.px)

        fontSize = 14.px
    }
} 
