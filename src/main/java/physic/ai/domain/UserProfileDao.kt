package physic.ai.domain

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import jakarta.inject.Inject
import org.bson.conversions.Bson
import physic.ai.domain.contracts.IUserProfileDao
import com.mongodb.client.model.Filters.eq
import com.mongodb.client.model.Updates
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserProfileDao: IUserProfileDao {
    @Inject
    lateinit var mongoClient: MongoClient

    private val userCollection: MongoCollection<UserProfileEntity> by lazy {
        mongoClient.getDatabase("physical").getCollection("users", UserProfileEntity::class.java)
    }

    override fun getUserProfile(username: String): UserProfileEntity {
        val filter: Bson = eq("username", username)
        return userCollection.find(filter).first()
    }

    override fun registerUser(user: UserProfileEntity) {
        userCollection.insertOne(user)
    }

    override fun unregisterUser(username: String) {
        TODO("Not yet implemented")
    }

    override fun updateUserProfile(username: String, email: String?, premium: Boolean?) {
        val filter: Bson = eq("username", username)
        val updates = mutableListOf<Bson>()
        if (email != null) updates.add(Updates.set("email", email))
        if (premium != null) updates.add(Updates.set("premium", premium))

        userCollection.updateOne(filter, Updates.combine(updates))

    }
}