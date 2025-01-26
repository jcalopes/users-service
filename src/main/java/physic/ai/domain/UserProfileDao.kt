package physic.ai.domain

import physic.ai.domain.contracts.IUserProfileDao

class UserProfileDao: IUserProfileDao {

    override fun getUserProfile(username: String): UserProfile {
        TODO("Not yet implemented")
    }

    override fun registerUser(user: UserProfile) {
        TODO("Not yet implemented")
    }

    override fun unregisterUser(username: String) {
        TODO("Not yet implemented")
    }

    override fun updateUserProfile(username: String, email: String, premium: Boolean) {
        TODO("Not yet implemented")
    }
}