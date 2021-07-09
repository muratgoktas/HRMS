package kodlamaio.HRMS.api.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController // Java olmayan uygulamalarda beni kullansın.
@RequestMapping("/api/users")
@NoArgsConstructor
@AllArgsConstructor
public class UsersController {

	private UserService userService;

	@GetMapping("/getAll")
	public DataResult<List<User>> getAll() {

		return this.userService.getAll();
	}
}
