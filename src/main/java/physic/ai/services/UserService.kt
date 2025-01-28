package physic.ai.services

import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import physic.ai.domain.UserProfileEntity
import physic.ai.domain.contracts.IUserProfileDao

@ApplicationScoped
class UserService {

    @Inject
    @field: Default
    lateinit var userProfileDao: IUserProfileDao

    fun getUserProfile(username: String): UserProfileEntity {
         return userProfileDao.getUserProfile(username)
    }

    fun registerUser(userProfileEntity: UserProfileEntity) {
        return userProfileDao.registerUser(userProfileEntity)
    }

    fun updateUserProfile(username: String, email: String?, premium: Boolean?) {
        return userProfileDao.updateUserProfile(username, email, premium)
    }

    fun unregisterUser(username: String) {
        return userProfileDao.unregisterUser(username)
    }
}