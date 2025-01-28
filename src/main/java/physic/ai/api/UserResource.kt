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
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{username}")
    fun getUserProfile(username: String) = userService.getUserProfile(username)

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    fun registerUser(userProfileEntity: UserProfileEntity) = userService.registerUser(userProfileEntity)

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    fun updateUserProfile(userUpdatedDto: UserUpdatedDto) {
      val (username, email, premium) = userUpdatedDto
      return userService.updateUserProfile(username, email, premium)
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    fun unregisterUser(username: String) = userService.unregisterUser(username)

}