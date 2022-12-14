package user.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value ="user")
public class UserController2 {

	@GetMapping(value = "uploadForm")
	public String uploadForm() {
		return "user/uploadForm";
	}
	/*
	@RequestMapping(value = "upload")
	@ResponseBody
	public void upload(@RequestParam MultipartFile img) {
		//가상폴더
		String filePath = "D:\\Coding\\spring\\work\\chapter06_SpringWebMaven\\src\\main\\webapp\\WEB-INF\\storage";
		// 가상폴더 경로에 \\ 역슬래쉬 2개를 / 슬래쉬 1개로 바꿔도 된다.
		//"D:/Coding/spring/work/chapter06_SpringWebMaven/src/main/webapp/WEB-INF/storage";
		String fileName = img.getOriginalFilename();
		
		File file = new File(filePath, fileName);
		
		try {
			//FileCopyUtils.copy(img.getInputStream(), new FileOutputStream(file)); //복사
			img.transferTo(file);
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //복사
	}
	*/
	
	/*
	 //name="img" 1개인 경우
	@RequestMapping(value = "upload")
	@ResponseBody
	public String upload(@RequestParam MultipartFile img, HttpSession session) {
		//실제폴더
		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
		String fileName = img.getOriginalFilename();
		System.out.println("실제폴더 = " + filePath);
		
		File file = new File(filePath, fileName);
		
		try {
			//FileCopyUtils.copy(img.getInputStream(), new FileOutputStream(file)); //복사
			img.transferTo(file);
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //복사
		return "<img src='../WEB-INF/storage/" + fileName + "' width='300' height='300'/>";
	}
	*/

	/*
//name="img" 2개 이상일 경우, 배열로 받아온다.
	@RequestMapping(value = "upload")
	@ResponseBody
	public void upload(@RequestParam MultipartFile[] img, HttpSession session) {
		//실제폴더
		String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
		String fileName;
		File file;
		
		if(img[0] != null) {
			fileName = img[0].getOriginalFilename();
			file = new File(filePath, fileName);
			
			try {
				img[0].transferTo(file);
			}  catch (IOException e) {
				e.printStackTrace();
			} 
		}//img[0]
		if(img[1] != null) {
			fileName = img[0].getOriginalFilename();
			file = new File(filePath, fileName);
			
			try {
				img[1].transferTo(file);
			}  catch (IOException e) {
				e.printStackTrace();
			} 
		}//img[1]
	
	}
	*/
	
	//한번에 여러개 파일 선택
		@RequestMapping(value = "upload")
		@ResponseBody
		public void upload(@RequestParam ("img[]") List<MultipartFile> list, HttpSession session) {
			//실제폴더
			String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
			String fileName;
			File file;
			
			for(MultipartFile img : list) {
				fileName = img.getOriginalFilename();
				file = new File(filePath, fileName);
				
				try {
					img.transferTo(file);
				}  catch (IOException e) {
					e.printStackTrace();
				} 
			}//for
		}
		
		//name="img" 1개인 경우
		@RequestMapping(value = "upload2", produces = "text/html; charset=UTF-8")
		@ResponseBody
		public String upload2(@RequestParam MultipartFile img, HttpSession session) {
			//실제폴더
			String filePath = session.getServletContext().getRealPath("/WEB-INF/storage");
			String fileName = img.getOriginalFilename();
			System.out.println("실제폴더 = " + filePath);
			
			File file = new File(filePath, fileName);
			
			try {
				//FileCopyUtils.copy(img.getInputStream(), new FileOutputStream(file)); //복사
				img.transferTo(file);
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //복사
			return "<img src='../storage/" + fileName + "' width='300' height='300'/>";
		}
}
