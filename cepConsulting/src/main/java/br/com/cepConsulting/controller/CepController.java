package br.com.cepConsulting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")

public class CepController {
     @GetMapping("/consulta-cep")
     public String consultaCepaaaa22(){
          return "Cep Angelo";
     }
     
     @GetMapping("/consulta-novo-cep")
     public String consultaCepaaaa22(){
          return "Cep Zandra";
     }
     
}
