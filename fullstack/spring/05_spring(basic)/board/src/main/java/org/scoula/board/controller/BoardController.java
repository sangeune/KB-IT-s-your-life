package org.scoula.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
@Log4j2
public class BoardController {
    private final BoardService service;

    @GetMapping("/list")
    public void list(Model model) {
        log.info("list.......");
        model.addAttribute("list", service.getList());
    }

    @GetMapping("/get")
    public void get(@RequestParam("no") Long no, Model model) {
        log.info("get.......");
        model.addAttribute("board", service.get(no));
    }

    @GetMapping("/create")
    public void create() {
        log.info("create.......");
    }

    @PostMapping("/create")
    public String create(BoardDTO board) {
        log.info("create.......");
        service.create(board);
        return "redirect:/board/list";
    }

    @GetMapping("/update")
    public void update(@RequestParam("no") Long no, Model model) {
        log.info("update.......");
        model.addAttribute("board", service.get(no));
    }

    @PostMapping("/update")
    public String update(BoardDTO board) {
        log.info("update.......");
        service.update(board);
        return "redirect:/board/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("no") Long no) {
        log.info("delete........");
        service.delete(no);
        return "redirect:/board/list";
    }
}
