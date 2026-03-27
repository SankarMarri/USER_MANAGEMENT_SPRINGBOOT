package UserManagement.um.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import UserManagement.um.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

} 
