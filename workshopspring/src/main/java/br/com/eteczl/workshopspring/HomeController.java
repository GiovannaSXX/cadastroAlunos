package br.com.eteczl.workshopspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView acessoHome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");

        Aluno aluno = new Aluno("Giovanna",
                                "gigi@etec");

      modelAndView.addObject("primeiroAluno", aluno);

       return modelAndView;


    }
}
