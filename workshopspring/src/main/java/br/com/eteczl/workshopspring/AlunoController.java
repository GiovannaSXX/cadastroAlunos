package br.com.eteczl.workshopspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller

public class AlunoController {

    private List<Aluno> listagemAlunos = new ArrayList<>();

    @GetMapping("/alunos")
    public ModelAndView alunoListagem(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("listagem");


        Aluno aluno1 = new Aluno("Giovanna Silva",
                "giovanna.silva@etec.sp.gov.br");

        Aluno aluno2 = new Aluno("Luiz Gustavo",
                "ldias@etec.sp.gov.br");

        listagemAlunos.add(aluno1);
        listagemAlunos.add(aluno2);

        modelAndView.addObject("listagemAlunos", listagemAlunos);
        return modelAndView;
    }


    @PostMapping("/cadastro-alunos")
    public RedirectView cadastroAlunoSalvar(Aluno aluno){
        listagemAlunos.add(aluno);
        return new RedirectView("/alunos");

    }
    @GetMapping("/cadastro-alunos")
    public ModelAndView cadastroAlunoAcesso(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cadastro");
        return modelAndView;
    }
}