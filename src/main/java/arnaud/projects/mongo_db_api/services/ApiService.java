package arnaud.projects.mongo_db_api.services;

import arnaud.projects.mongo_db_api.models.Users;
import arnaud.projects.mongo_db_api.repositories.UsersRepository;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ApiService {

    @Autowired
    UsersRepository usersRepository;

    public List<Users> returnAllUsers(){
        return usersRepository.findAllUsers();
    }

    public Users registerUser(Users user){
        log.info("User " + user.get_name() + " has been created");
        return usersRepository.save(user);
    }

    public void deleteUser(Users user){
        log.info("User with id : " + user.get_id() + " has been deleted");
        usersRepository.delete(user);
    }
}
