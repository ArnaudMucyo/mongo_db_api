package arnaud.projects.mongo_db_api.controllers;

import arnaud.projects.mongo_db_api.models.Users;
import arnaud.projects.mongo_db_api.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo")
public class ApiController {

    @Autowired
    ApiService apiService;

    //@Cacheable("usersCache")
    @GetMapping("/all/users")
    public List<Users> getAllUsers(){
        return apiService.returnAllUsers();
    }

    @PostMapping("/register/user")
    public Users createUser(@RequestBody Users user){
        return apiService.registerUser(user);
    }

    @DeleteMapping("/delete/user")
    public void deleteSpecificUser(@RequestBody Users user){
        apiService.deleteUser(user);
    }
}
