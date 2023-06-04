package ChatApplication.ChatApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ChatApplication.ChatApplication.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{

}
