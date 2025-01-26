package physic.ai.domain.contracts

import physic.ai.domain.UserProfileEntity

interface IUserProfileDao {
    fun getUserProfile(username: String): UserProfileEntity
    fun registerUser(user: UserProfileEntity)
    fun unregisterUser(username: String)
    fun updateUserProfile(username: String, email: String?, premium: Boolean?)
}