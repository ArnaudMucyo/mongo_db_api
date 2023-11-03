package arnaud.projects.mongo_db_api;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableCaching
@EnableMongoRepositories
//@EnableRedisRepositories
@Configuration
@SpringBootApplication
public class MongoDbApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbApiApplication.class, args);
    }

}
