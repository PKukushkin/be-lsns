package ChatApplication.ChatApplication.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import ChatApplication.ChatApplication.repository.UserRepo;
import ChatApplication.ChatApplication.User;
import ChatApplication.ChatApplication.webDto.UserRegistorDto;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo userRepository;
	public UserServiceImpl(UserRepo userRepository) {
		super();
		this.userRepository = userRepository;
	}
	@Override
	public User save(UserRegistorDto registrationDto) {
		User user=new User(
				registrationDto.getid()
,				registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword()
				
				);
		return userRepository.save(user);
	}

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }
    
    @Override
    public List<User> getAllUsers() {
    	List<User> user=userRepository.findAll();
        return user;
    }

 	    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
