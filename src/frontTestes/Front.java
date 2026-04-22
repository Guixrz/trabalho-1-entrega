package frontTestes;

import entidades.Usuarios;
import entidades.enums.Modalidade;
import entidades.enums.Status;
import entidades.enums.Tipo;
import servicos.*;
import java.util.List;
import java.util.Scanner;

public class Front {

    private Scanner sc;
    private UsuarioService usuarioService;
    private OportunidadeService oportunidadeService;
    private InscricaoService inscricaoService;
    private Usuarios usuarioLogado;

    public Front(Scanner sc, UsuarioService usuarioService, OportunidadeService oportunidadeService, InscricaoService inscricaoService) {
        this.sc = sc;
        this.usuarioService = usuarioService;
        this.oportunidadeService = oportunidadeService;
        this.inscricaoService = inscricaoService;
        this.usuarioLogado = null;
    }

    public void start() {
        System.out.println("gerenciamento de extensão");

        while (true) {
            if (usuarioLogado == null) {
                if (!loginMenu()) {
                    break;
                }
            } else {
                switch (usuarioLogado.getPapel()) {
                    case discente:
                        menuDiscente();
                        break;
                    case docente:
                        menuDocente();
                        break;
                    case admin:
                        menuAdmin();
                        break;
                    default:
                        System.out.println("papel não suportado ainda.");
                        usuarioLogado = null;
                        break;
                }
            }
        }
        System.out.println("programa encerrado.");
    }

    private boolean loginMenu() {
        System.out.println("\n--- Menu Inicial ---");
        System.out.println("1. Login");
        System.out.println("0. Sair");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                login();
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opção inválida.");
                return true;
        }
    }

    private void login() {
        System.out.println("\n--- Login ---");
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        usuarioLogado = usuarioService.login(email, senha);
        if (usuarioLogado == null) {
            System.out.println("Falha no login. Tente novamente.");
        }
    }

    private void menuDiscente() {
        while (usuarioLogado != null) {
            System.out.println("\n--- Menu Discente ---");
            System.out.println("1. Listar oportunidades abertas");
            System.out.println("2. Inscrever-se em oportunidade");
            System.out.println("3. Listar minhas inscrições");
            System.out.println("4. Abandonar inscrição");
            System.out.println("5. Validar certificado");
            System.out.println("0. saida");
            int opcao = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (opcao) {
                case 1:
                    oportunidadeService.mostrarOportunidades();
                    break;
                case 2:
                    List<entidades.Oportunidade> abertas = oportunidadeService.listarAbertas();
                    if (abertas.isEmpty()) {
                        System.out.println("Nenhuma oportunidade aberta.");
                        break;
                    }
                    oportunidadeService.mostrarOportunidades();
                    System.out.print("Escolha o índice da oportunidade: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    if (idx < 0 || idx >= abertas.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }
                    entidades.Oportunidade opp = abertas.get(idx);
                    int result = inscricaoService.inscrever((entidades.Discente) usuarioLogado, opp);
                    if (result == 1) {
                        System.out.println("Inscrição realizada com sucesso.");
                    } else {
                        System.out.println("Falha na inscrição.");
                    }
                    break;
                case 3:
                    inscricaoService.listarInscricoes((entidades.Discente) usuarioLogado);
                    break;
                case 4:
                    inscricaoService.mostrarInscricoes((entidades.Discente) usuarioLogado);
                    System.out.print("Escolha o índice da inscrição para abandonar: ");
                    int idxAbandonar = sc.nextInt();
                    sc.nextLine();
                    List<entidades.Inscricao> inscricoes = inscricaoService.getInscricoes((entidades.Discente) usuarioLogado); // need to add this method
                    if (idxAbandonar < 0 || idxAbandonar >= inscricoes.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }
                    entidades.Inscricao insc = inscricoes.get(idxAbandonar);
                    int resAbandonar = inscricaoService.abandonar((entidades.Discente) usuarioLogado, insc.getOportunidade());
                    if (resAbandonar == 1) {
                        System.out.println("Inscrição abandonada.");
                    } else {
                        System.out.println("Falha ao abandonar.");
                    }
                    break;
                case 5:
                    System.out.print("Código hash do certificado: ");
                    String hash = sc.nextLine();
                    usuarioService.validarCertificado(hash);
                    break;
                case 0:
                    usuarioLogado = null;
                    System.out.println("saida realizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void menuDocente() {
        while (usuarioLogado != null) {
            System.out.println("\n--- Menu Docente ---");
            System.out.println("1. Listar oportunidades pendentes");
            System.out.println("2. Aprovar oportunidade");
            System.out.println("3. Rejeitar oportunidade");
            System.out.println("0. saida");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    oportunidadeService.mostrarPendentes();
                    break;
                case 2:
                    List<entidades.Oportunidade> pendentes = oportunidadeService.listarPendentes();
                    if (pendentes.isEmpty()) {
                        System.out.println("Nenhuma oportunidade pendente.");
                        break;
                    }
                    oportunidadeService.mostrarPendentes();
                    System.out.print("Escolha o índice da oportunidade para aprovar: ");
                    int idxAprovar = sc.nextInt();
                    sc.nextLine();
                    if (idxAprovar < 0 || idxAprovar >= pendentes.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }
                    entidades.Oportunidade oppAprovar = pendentes.get(idxAprovar);
                    oportunidadeService.aprovar(oppAprovar, (entidades.Docente) usuarioLogado);
                    break;
                case 3:
                    List<entidades.Oportunidade> pendentesRej = oportunidadeService.listarPendentes();
                    if (pendentesRej.isEmpty()) {
                        System.out.println("Nenhuma oportunidade pendente.");
                        break;
                    }
                    oportunidadeService.mostrarPendentes();
                    System.out.print("Escolha o índice da oportunidade para rejeitar: ");
                    int idxRejeitar = sc.nextInt();
                    sc.nextLine();
                    if (idxRejeitar < 0 || idxRejeitar >= pendentesRej.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }
                    entidades.Oportunidade oppRejeitar = pendentesRej.get(idxRejeitar);
                    oportunidadeService.rejeitar(oppRejeitar, (entidades.Docente) usuarioLogado);
                    break;
                case 0:
                    usuarioLogado = null;
                    System.out.println("saida realizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void menuAdmin() {
        while (usuarioLogado != null) {
            System.out.println("\n--- Menu Admin ---");
            System.out.println("1. Criar oportunidade");
            System.out.println("2. Listar todas oportunidades");
            System.out.println("3. Listar todos usuários");
            System.out.println("0. Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    criarOportunidade();
                    break;
                case 2:
                    oportunidadeService.mostrarTodasOportunidades();
                    break;
                case 3:
                    usuarioService.listarUsuarios();
                    break;
                case 0:
                    usuarioLogado = null;
                    System.out.println("Saída realizada.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void criarOportunidade() {
        System.out.println("\n--- Criar Oportunidade ---");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Descrição: ");
        String descricao = sc.nextLine();
        System.out.print("Tipo: ");
        String tipoStr = sc.nextLine();
        Tipo tipo = Tipo.valueOf(tipoStr.toLowerCase());
        System.out.print("Modalidade: ");
        String modStr = sc.nextLine();
        Modalidade modalidade = Modalidade.valueOf(modStr.toLowerCase());
        System.out.print("Carga horária: ");
        int carga = sc.nextInt();
        System.out.print("Vagas: ");
        int vagas = sc.nextInt();
        sc.nextLine();
        if (!(usuarioLogado instanceof entidades.Docente)) {
            System.out.println("Apenas docentes podem criar oportunidades.");
            return;
        }
        entidades.Docente autor = (entidades.Docente) usuarioLogado;
        entidades.Oportunidade opp = new entidades.Oportunidade(titulo, descricao, tipo, modalidade, carga, vagas, Status.pendente, java.time.LocalDateTime.now(), autor, autor);
        oportunidadeService.salvar(opp);
        System.out.println("Oportunidade criada com sucesso.");
    }
}
