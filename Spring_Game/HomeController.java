package com.jiin.game;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jiin.game.DBCommon;
import com.jiin.game.Person;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	//user 테이블 생성
		@RequestMapping(value = "/create_table", method = RequestMethod.GET)
		public String createTable(Locale locale, Model model) {
			DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\Game.sqlite", "userInfo");
			dbCommon.createTable(new Person());
			return "done";
		}
		
	//홈(로그인) 화면 2019.06.14 -JI.K
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object isSignIn = session.getAttribute("login");
		if (isSignIn != null && (Boolean)isSignIn) {
			DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\Game.sqlite", "userInfo");
			model.addAttribute("select_result", dbCommon.selectDataTableTag(new Person()));
			return "Character";
		}
		return "redirect:/login";
	}
	
	
	//user 정보 입력 url 생성 2019.06.14 -JI.K
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	
	//input action 라우터 2019.06.14 -JI.K
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(@RequestParam("id") String id, @RequestParam("pass") String pass, @RequestParam("name") String name,@RequestParam("attackPoint") String attackPoint,@RequestParam("guardPoint") String guardPoint,
			@RequestParam("HP") String HP) {
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\Game.sqlite", "userInfo");
//		dbCommon.insertData(new Person(id,pass,name,attackPoint,guardPoint,HP));
		
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(pass.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : md.digest()) {
				sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
			}
			pass = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		dbCommon.insertData(new Person(id,pass,name,attackPoint,guardPoint,HP));
		return "done";
	}
	
	//로그아웃 로직 라우터 2019.06.14 -JI.K
//	@RequestMapping(value = "/logout", method = RequestMethod.GET)
//	public String logout(Locale locale, Model model) {
//		return "login";
//	}
	
	//로그인 action 라우터 생성
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "login";
	}
	
	//로그아웃 session 종료 라우터 생성
	@RequestMapping(value = "/sign_out", method = RequestMethod.GET)
	public String signOut(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}
	
	
	//로그인 pw 암호화 로직 라우터 2019.0614 -JI.K
	@RequestMapping(value = "/do_sign_in", method = RequestMethod.GET)
	public String do_sign_in(Locale locale, Model model, HttpServletRequest request, @RequestParam("id") String id, @RequestParam("pass") String pass) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(pass.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : md.digest()) {
				sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
			}
			pass = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\Game.sqlite", "userInfo");
		if (dbCommon.signIn(id, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("login", true); 
			return "redirect:/";
		} else {
			return "redirect:/login";
		}
	}
	
	//캐릭터 정보 화면 2019.06.14 -SL.K
	@RequestMapping(value = "/Character", method = RequestMethod.GET)
	public String character(Locale locale, Model model) {
		//user list
		//user choice logic
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\Game.sqlite", "userInfo");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Person()));
		return "Character";
	}
	
	//대전 화면 2019.06.14 -SH.K
	@RequestMapping(value = "/fight_screen", method = RequestMethod.GET)
	public String fight_screen(Locale locale, Model model) {
		
		return "fight";
	}
	
	//대전 로직 2019.06.14 -all
	@RequestMapping(value = "/fight_logic", method = RequestMethod.GET)
	public String fight(Locale locale, Model model) {
		return "fight_screen";
	}
	
	// 데이터 수정 화면
		@RequestMapping(value = "/modify", method = RequestMethod.GET)	
		public String modify(Locale locale, Model model, @RequestParam("idx") int idx) {
				DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\Game.sqlite", "userInfo");
				model.addAllAttributes(dbCommon.detailsData(new Person(), idx));
				return "modify";	
			}
	
}
