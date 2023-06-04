package ChatApplication.ChatApplication.services;
import ChatApplication.ChatApplication.webDto.UserRegistorDto;

import java.util.List;

import ChatApplication.ChatApplication.User;
public interface UserService {
	
	  User save(UserRegistorDto registrationDto) ;
	    User getUserById(Long userId);

	    List<User> getAllUsers();

	    void deleteUser(Long userId);

}
