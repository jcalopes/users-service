package physic.ai.integration

import io.smallrye.config.ConfigMapping

@ConfigMapping(prefix = "mongo")
interface MongoConfig {
    fun dbName(): String
    fun collectionName(): String
}


