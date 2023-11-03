package arnaud.projects.mongo_db_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.redis.core.RedisHash;

//@RedisHash("users")
@Document(collection = "users")
@Setter
@Getter
@NoArgsConstructor
public class Users {

    @Id
    private String _id;

    @Field(name = "_name")
    private String _name;

    @Field(name = "_email")
    private String _email;

    @Field(name = "phoneNumber")
    private String phoneNumber;

}
