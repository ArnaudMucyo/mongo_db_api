package arnaud.projects.mongo_db_api.repositories;

import arnaud.projects.mongo_db_api.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends MongoRepository<Users,String> {

    @Query(value = "{}")
    List<Users> findAllUsers();
}
