package br.vianna.edu.academy.ViaAcademy;

import br.vianna.edu.academy.ViaAcademy.model.Professor;
import br.vianna.edu.academy.ViaAcademy.model.dao.ProfessorDao;
import br.vianna.edu.academy.ViaAcademy.model.emn.EEspecializacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class ViaAcademyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ViaAcademyApplication.class, args);
	}

	@Autowired
	ProfessorDao pd;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("#### SERVER STARTER ####");

		Professor p = new Professor(EEspecializacao.MESTRADO,5,
				new Date(),null);
		p.setEmail("ze@ze");
		p.setLogin("ze");
		p.setNome("zezin das Coves");
		p.setSenha("123");

		pd.save(p);

//		Professor p1 = pd.getReferenceById(1);
//		System.out.println("nome "+p1.getNome());

		Optional<Professor> p2 = pd.findById(1);
		if ( p2.isPresent() ){
			System.out.println("nome "+p2.get().getNome());
		}

		Professor p3 = pd.findByLoginAndSenha("ze", "123");
		System.out.println("nome "+p3.getNome());


	}
}
