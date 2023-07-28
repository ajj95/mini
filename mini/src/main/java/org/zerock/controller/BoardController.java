package org.zerock.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;



@Log4j
@Controller
@AllArgsConstructor
@RequestMapping("/board/*")
public class BoardController {

	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		log.info("list");
		model.addAttribute("list", service.getList());
	}
	
	@GetMapping("/register")
	public void registerg() {
		log.info("register get");
		
	}
	
	@PostMapping("/register")
	public String registerp(BoardVO board) {
		log.info("register post");
		service.register(board);
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("bno") Long bno,  Model model) {
		log.info("get, modify");
		model.addAttribute("board", service.detail(bno));
	}
	
	@PostMapping("/modify")
	public String update(BoardVO board) {
		service.modify(board);
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno) {
		service.remove(bno);
		return "redirect:/board/list";
	}
	
	
	
}
