import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv
import styled.styledImg
import styled.styledP

interface AvatarEmokiProps : RProps {
    var avatarEmokiData: AvatarEmokiData
}

class AvatarEmokiState : RState

class AvatarEmoki(props: AvatarEmokiProps) : RComponent<AvatarEmokiProps, AvatarEmokiState>(props) {
    override fun RBuilder.render() {
        props.avatarEmokiData.run {
            styledDiv {
                css {
                    +AvatarEmokiStyles.containerStyle
                }

                styledImg(src = photo) {
                    css {
                        +AvatarEmokiStyles.avatarStyle
                    }
                }

                styledP {
                    css {
                        +when (textAlign) {
                            Alignment.Left -> AvatarEmokiStyles.avatarTextLeft
                            Alignment.Right -> AvatarEmokiStyles.avatarTextRight
                        }
                    }
                    +avatarName
                }
            }
        }
    }
}