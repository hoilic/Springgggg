package user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import oracle.jdbc.proxy.annotation.Post;
import user.bean.UserDTO;
import user.service.UserService;

@Component //@Controller 써도 된다.
@RequestMapping(value ="user") // /안넣어도 됨
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "writeForm")
	public String writeForm() {
		return "user/writeForm";
	}
	
	@PostMapping(value = "write")
	@ResponseBody
	public void write(@ModelAttribute UserDTO userDTO ) {
		userService.write(userDTO);
	}
	
	@GetMapping(value = "list")
	public String list() {
		return "user/list";
	}
	@PostMapping(value = "getUserList")
	@ResponseBody
	public List<UserDTO> getUserList() {
		return userService.getUserList();
	}
	
	@PostMapping(value = "isExistId")
	@ResponseBody
	public String isExistId(@RequestParam String id) {
		return userService.isExistId(id);
	}
	
	@GetMapping(value = "updateForm")
	public String updateForm() {
		return "user/updateForm";
	}
	@PostMapping(value = "getUser")
	@ResponseBody
	public UserDTO getUser(@RequestParam String id) {
		return userService.getUser(id);
	}
	@PostMapping(value = "update")
	@ResponseBody
	public void update(@ModelAttribute UserDTO userDTO ) {
		userService.update(userDTO);
	}
	@GetMapping(value = "deleteForm")
	public String deleteForm() {
		return "user/deleteForm";
	}
	@PostMapping(value = "delete")
	@ResponseBody
	public void delete(@RequestParam String id) {
		userService.delete(id);
	}

	
}