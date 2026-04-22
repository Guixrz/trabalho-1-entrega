package repositorios;

import entidades.Certificados;

import java.util.ArrayList;
import java.util.List;

public class CertificadosRepositorio {

    private List<Certificados> certificados = new ArrayList<>();

    public void salvar(Certificados c){
        certificados.add(c);
    }

    public Certificados buscarHash(String hash){
        for (Certificados c : certificados) {
            if(c.getUuid_hash().equals(hash)){
                return c;
            }
        }
        return null;
    }

    public List<Certificados> listarCertificados(){
        return certificados;
    }

}
