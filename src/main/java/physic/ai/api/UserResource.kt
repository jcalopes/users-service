package physic.ai.api

import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.DELETE
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import physic.ai.api.dto.UserUpdatedDto
import physic.ai.domain.UserProfileEntity
import physic.ai.services.UserService

@Path("/api/v1/user")
class UserResource {
    @Inject
    @field: Default
    lateinit var userService: UserService

    @GET
    @Path("/{username}")
    fun getUserProfile(username: String) = userService.getUserProfile(username)

    @POST
    fun registerUser(userProfileEntity: UserProfileEntity) = userService.registerUser(userProfileEntity)

    @PUT
    fun updateUserProfile(userUpdatedDto: UserUpdatedDto) {
      val (username, email, premium) = userUpdatedDto
      return userService.updateUserProfile(username, email, premium)
    }

    @DELETE
    fun unregisterUser(username: String) = userService.unregisterUser(username)

}