package br.vianna.edu.academy.ViaAcademy.controler;

import br.vianna.edu.academy.ViaAcademy.model.dto.DadosImc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/testa")
public class TestaControler {

    @GetMapping("/home")
    public String chamaHome(Model m, @ModelAttribute DadosImc dados){
        m.addAttribute("nome","Exemplo IMC");
        DadosImc di = new DadosImc();
        di.setNome("zezin");
        m.addAttribute("dados",di);
        m.addAttribute("msg", "dados salvos com sucesso");

        return "home";
    }

    @PostMapping("/home")
    public String gravaHome( @ModelAttribute DadosImc dados){
        System.out.println("Nome :: "+dados.getNome());
        System.out.println("Peso :: "+dados.getPeso());
        System.out.println("Altura :: "+dados.getAltura());

        return "redirect:/testa/home";
    }


}
