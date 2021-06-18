package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.abstracts.User;



public interface UserDao extends JpaRepository<User,Integer> {

}
