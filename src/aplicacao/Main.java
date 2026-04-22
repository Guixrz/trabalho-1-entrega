package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import frontTestes.Front;
import repositorios.*;
import servicos.*;
import entidades.Curso;
import entidades.Discente;
import entidades.Docente;
import entidades.Oportunidade;
import entidades.enums.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // repositórios(feitos de arrayList)
        UsuarioRepositorio usuarioRepo = new UsuarioRepositorio();
        OportunidadeRepositorio oportunidadeRepo = new OportunidadeRepositorio();
        InscricaoRepositorio inscricaoRepo = new InscricaoRepositorio();
        CertificadosRepositorio certificadosRepo = new CertificadosRepositorio();

        // serviços
        UsuarioService usuarioService = new UsuarioService(usuarioRepo, certificadosRepo);
        OportunidadeService oportunidadeService = new OportunidadeService(oportunidadeRepo);
        InscricaoService inscricaoService = new InscricaoService(inscricaoRepo, oportunidadeRepo);

        // dados de exemplo
        //Curso curso = new Curso("Engenharia de Software", 123, 3000, "1.0");
        //Discente discente = new Discente("João Silva", "joao@email.com", "123", Papel.discente, "12345", 1, curso);
        //usuarioRepo.salvar(discente);

        //Docente docente = new Docente("Prof Maria", "maria@email.com", "123", Papel.docente, "siape123", "Computação");
        //usuarioRepo.salvar(docente);

        // admin simples
        //Docente admin = new Docente("Admin User", "admin@email.com", "admin", Papel.admin, "admin123", "Admin");
        //usuarioRepo.salvar(admin);

        //Oportunidade opp1 = new Oportunidade("Estágio em TI", "Descrição do estágio", Tipo.estagio, Modalidade.presencial, 20, 5, Status.em_progresso, LocalDateTime.now(), docente, docente);
        //oportunidadeRepo.salvar(opp1);

        //Oportunidade opp2 = new Oportunidade("Projeto de Pesquisa", "Pesquisa acadêmica", Tipo.pesquisa, Modalidade.remoto, 40, 2, Status.pendente, LocalDateTime.now(), docente, docente);
        //oportunidadeRepo.salvar(opp2);

        // front
        Front front = new Front(sc, usuarioService, oportunidadeService, inscricaoService);
        front.start();

        sc.close();
    }
}