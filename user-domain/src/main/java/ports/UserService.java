package ports;

import domain.UserHistory;

public interface UserService {

	UserHistory getHistoryById(String id);

}
