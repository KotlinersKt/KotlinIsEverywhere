import kotlinx.css.*
import styled.StyleSheet

object AvatarEmokiStyles : StyleSheet("AvatarEmokiStyles", isStatic = true) {
    val containerStyle by css {
        display = Display.flex
    }

    val avatarStyle by css {
        width = 100.px
        height = LinearDimension.auto
    }

    val avatarTextLeft by css {
        put("order", "-1")
    }

    val avatarTextRight by css {
        put("order", "0")
    }
}
