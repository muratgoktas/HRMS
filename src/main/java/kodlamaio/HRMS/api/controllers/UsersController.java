package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.entities.abstracts.User;


@RestController //Java olmayan uygulamalarda beni kullansın.
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService userService;
	
	@Autowired	
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getAll")
	public DataResult<List<User>>  getAll() {

		return this.userService.getAll();
	}
}
