package servicos;

import entidades.Certificados;
import entidades.Discente;
import entidades.Oportunidade;
import repositorios.CertificadosRepositorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CertificadoService {

    private CertificadosRepositorio certificadosRepo;

    public CertificadoService(CertificadosRepositorio certificadosRepo) {
        this.certificadosRepo = certificadosRepo;
    }

    public Certificados emitir(Discente discente, Oportunidade oportunidade,
                               int horas) {
        String hash = UUID.randomUUID().toString();
        String path = "certificados/" + hash + ".pdf";

        Certificados cert = new Certificados(hash, discente, oportunidade,
                LocalDate.now(), horas, path);
        certificadosRepo.salvar(cert);
        System.out.println("certificado emitido!");
        return cert;
    }

    public void validar(String hash) {
        Certificados c = certificadosRepo.buscarHash(hash);
        if (c == null) {
            System.out.println("certificado não encontrado ou inválido.");
            return;
        }
        System.out.println("certificado válido!");
        System.out.println("   Discente: "     + c.getDiscente().getNome());
        System.out.println("   Oportunidade: " + c.getOportunidade().getTitulo());
        System.out.println("   Horas: "        + c.getCargaHoraria());
        System.out.println("   Emitido em: "   + c.getData_emissao());
    }

    public void listarDiscente(Discente discente) {
        for (Certificados c : certificadosRepo.listarCertificados()) {
            if (c.getDiscente().equals(discente)) {
                System.out.println("- " + c.getOportunidade().getTitulo()
                        + " | Hash: " + c.getUuid_hash()
                        + " | "       + c.getData_emissao());
            }
        }
    }

}
