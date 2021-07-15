package br.com.jun.regescweb.controllers;

import br.com.jun.regescweb.dto.RequisicaoNovoProfessor;
import br.com.jun.regescweb.models.Professor;
import br.com.jun.regescweb.models.StatusProfessor;
import br.com.jun.regescweb.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/professores")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("professores/index");
        List<Professor> professores = professorRepository.findAll();
        mv.addObject("professores", professores);
        return mv;
    }

    @GetMapping("/professor/new")
    public ModelAndView nnew() {
        ModelAndView mv = new ModelAndView("professores/new");
        mv.addObject("statusProfessor", StatusProfessor.values());
        return mv;
    }

    @PostMapping("/professores")
    public String create(RequisicaoNovoProfessor requisicao) {
        Professor professor = requisicao.toProfessor();
        System.out.println();
        System.out.println(requisicao);
        System.out.println();
        System.out.println(professor);
        System.out.println();

        professorRepository.save(professor);

        return "redirect:/professores";
    }
}
