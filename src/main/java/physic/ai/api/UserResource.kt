package physic.ai.api

import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import physic.ai.services.UserService

@Path("/api/v1/user")
class UserResource {

    @Inject
    lateinit var userService: UserService

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun getUser() =userService.getUser("test")
}