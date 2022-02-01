package br.com.vieiravictor.springbootandmysql.controller;

import br.com.vieiravictor.springbootandmysql.controller.dto.PessoaRs;
import br.com.vieiravictor.springbootandmysql.repository.PessoaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping("/")
    public List<PessoaRs> findAll() {
        var pessoas = pessoaRepository.findAll();
        return pessoas
                .stream().map(PessoaRs::converter)
                .collect(Collectors.toList());
    }
}
