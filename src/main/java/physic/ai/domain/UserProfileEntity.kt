package physic.ai.domain

data class UserProfileEntity(
    var username: String = "",
    var email: String = "",
    var premium: Boolean = false,
    var active: Boolean = false
)
