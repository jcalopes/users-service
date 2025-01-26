package physic.ai.api

import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import physic.ai.domain.UserProfile
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
    @Produces(MediaType.TEXT_PLAIN)
    fun registerUser(userProfile: UserProfile) = userService.registerUser(userProfile)
}