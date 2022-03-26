package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import service.MemberService;
import spring.Member;

@Controller
@SessionAttributes("Member")
public class MemberReigsterController {
	
	@Autowired
	public MemberService memberService;
	
	@RequestMapping(value="list")
	public String list(Model model) {
		model.addAttribute("list", memberService.list());
		return "/list";
	}
	
	@RequestMapping(value="write", method=RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("member", new Member());
		return "/regist";
	}
	
	@RequestMapping(value="write", method=RequestMethod.POST)
	public String write(@Valid Member member, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			return "/write";
		}
		memberService.write(member);
		return "redirect:/list";
	}
}
