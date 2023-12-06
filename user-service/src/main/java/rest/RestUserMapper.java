package rest;

import org.springframework.stereotype.Component;

import domain.UserHistory;

@Component
public interface RestUserMapper {

	UserDto toDto(UserHistory userHistory);

}
