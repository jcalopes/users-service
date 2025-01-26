package physic.ai.domain.contracts

import physic.ai.domain.UserProfile

interface IUserProfileDao {
    fun getUserProfile(username: String): UserProfile
    fun registerUser(user: UserProfile)
    fun unregisterUser(username: String)
    fun updateUserProfile(username: String, email: String, premium: Boolean)
}