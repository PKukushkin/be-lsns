package ChatApplication.ChatApplication.web;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ChatApplication.ChatApplication.User;
import ChatApplication.ChatApplication.services.UserService;
import ChatApplication.ChatApplication.webDto.UserRegistorDto;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/api/users")
public class UserRegistrationController {
private UserService userService;

public UserRegistrationController(UserService userService) {
	super();
	this.userService = userService;
}


@PostMapping
public ResponseEntity<UserRegistorDto> registerUserAccount(@ModelAttribute("user") UserRegistorDto registration) {
		userService.save(registration);
    if(registration!=null) {

        return new ResponseEntity<>(registration, HttpStatus.OK);
    }
    else {
    	 return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
 
}

@GetMapping
public ResponseEntity<List<User>> getAllUsers(){
    List<User> users = userService.getAllUsers();
    if(users!=null) {

        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    else {
    	 return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
    	
}
@GetMapping("{id}")
public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
    User user = userService.getUserById(userId);
    if(user!=null) {
        return new ResponseEntity<>(user,HttpStatus.OK);
    }else {
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        //or just return not found status code 
        //return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
   }
}

    // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }

}
