package rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import ports.UserService;

@RequestMapping("user")
@RestController
@RequiredArgsConstructor
public class UserRestAdapter {

	private final UserService userService;
	private final RestUserMapper mapper;

	@GetMapping("{id}")
	public ResponseEntity<UserDto> getHistoryById(@PathVariable String id) {
		var userDomain = userService.getHistoryById(id);
		var userDto = mapper.toDto(userDomain);
		return ResponseEntity.ok(userDto);
	}

}
