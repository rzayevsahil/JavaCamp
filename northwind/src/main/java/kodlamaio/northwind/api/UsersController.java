package kodlamaio.northwind.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.entities.User;

@RestController
@RequestMapping("/api/products")
public class UsersController {

	private UserService userService;

	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<?> add(@RequestBody User user) {
		return ResponseEntity.ok(this.userService.add(user)) ;
	}
}
