package user.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserDTO {
	private String name, id, pwd;
}
