package physic.ai.services

import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import physic.ai.domain.UserProfile
import physic.ai.domain.contracts.IUserProfileDao

@ApplicationScoped
class UserService {

    @Inject
    @field: Default
    lateinit var userProfileDao: IUserProfileDao

    fun getUserProfile(username: String): UserProfile {
         return userProfileDao.getUserProfile(username)
    }

    fun registerUser(userProfile: UserProfile) {
        return userProfileDao.registerUser(userProfile)
    }

    fun updateUserProfile(username: String, email: String, premium: Boolean) {
        return userProfileDao.updateUserProfile(username, email, premium)
    }

    fun unregisterUser(username: String) {
        return userProfileDao.unregisterUser(username)
    }
}