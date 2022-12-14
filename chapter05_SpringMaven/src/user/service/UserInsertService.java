package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserInsertService implements UserService {
	@Autowired
	private UserDTO userDTO;
	@Autowired
	private UserDAO userDAO;
	
//	public void setUserDAO(UserDAO userDAO) {
//		this.userDAO = userDAO;
//	}
//
//	public void setUserDTO(UserDTO userDTO) {
//		this.userDTO = userDTO;
//	}

	@Override
	public void execute() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("이름 입력 : ");
		String name = scanner.next();
		System.out.print("아이디 입력 : ");
		String id = scanner.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scanner.next();
		
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		//유
		
		userDAO.write(userDTO);
		
		//응답
		System.out.println(name + "님의 데이터를 DB에 저장했습니다.");
		
	


	}

}
