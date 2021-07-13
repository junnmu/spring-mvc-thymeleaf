package br.com.jun.regescweb.controllers;

import br.com.jun.regescweb.models.Professor;
import br.com.jun.regescweb.models.StatusProfessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProfessorController {

    @GetMapping("/professores")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("professores/index");

        Professor batman = new Professor("Batman", new BigDecimal(5000.0), StatusProfessor.ATIVO);
        Professor coringa = new Professor("Coringa", new BigDecimal(10000.0), StatusProfessor.APOSENTADO);
        Professor mulherMaravilha = new Professor("Mulher Maravilha", new BigDecimal(15000.0), StatusProfessor.INATIVO);
        List<Professor> professores = Arrays.asList(batman, coringa, mulherMaravilha);

        mv.addObject("professores", professores);
        return mv;
    }
}
