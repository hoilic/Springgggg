package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserDeleteService implements UserService {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserDTO userDTO;
	
	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("삭제할 아이디 입력 : ");
		String id = scanner.next();

		
		//DB
		UserDTO userDTO = userDAO.getUser(id);
		
		if(userDTO == null) {
			System.out.println("삭제할 아이디가 없습니다.");
			return;
		}
		
		userDAO.delete(id);
	
		System.out.println("데이터를 삭제했습니다.");

	}

}
