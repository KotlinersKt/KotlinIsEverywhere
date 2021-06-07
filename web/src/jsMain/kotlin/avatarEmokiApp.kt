import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.styledDiv

interface AvatarEmokiAppProps : RProps

class AvatarEmokiAppState : RState

class AvatarEmokiApp : RComponent<AvatarEmokiAppProps, AvatarEmokiAppState>() {
    override fun RBuilder.render() {
        val avatares = listOf(
            AvatarEmokiData(
                photo = "/static/gorroPNG.png",
                avatarName = "Sachin Tendulkar",
                textAlign = Alignment.Left
            ),
            AvatarEmokiData(
                photo = "/static/joelPNG.png",
                avatarName = "'Joel GDEMÑE",
                textAlign = Alignment.Right
            ),
            AvatarEmokiData(
                photo = "/static/chubyPNG.png",
                avatarName = "ChubyAvodroc",
                textAlign = Alignment.Left
            ),
            AvatarEmokiData(
                photo = "/static/sierPNG.png",
                avatarName = "Sierisimo Sier",
                textAlign = Alignment.Right
            ),
        )
        for (avatar in avatares) {
            styledDiv {
                key = avatar.avatarName
                child(AvatarEmoki::class) {
                    attrs {
                        avatarEmokiData = avatar
                    }
                }
            }
        }
    }
}
