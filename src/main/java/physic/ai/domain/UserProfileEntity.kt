package physic.ai.domain

import org.bson.types.ObjectId

data class UserProfileEntity(val id: ObjectId, val name: String, val email: String, val premium: Boolean, val active: Boolean)
