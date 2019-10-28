package blog.zciok.springboot.restful.product;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserAPI {
	private final UserService userService;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}

	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user) {
		User usr = null;
		
		try {
			usr = userService.findById(user.getId());
		} catch (Exception e) {}

		if (usr != null) {
			usr.setRequestCount(usr.getRequestCount() + 1);
			return ResponseEntity.ok(userService.save(usr));
		} else {
			user.setRequestCount(Integer.valueOf(1));
			return ResponseEntity.ok(userService.save(user));
		}
	}
}
