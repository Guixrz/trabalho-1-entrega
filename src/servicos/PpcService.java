package servicos;

import entidades.Curso;

import java.util.ArrayList;
import java.util.List;

public class PpcService {
    //teste simples
    public void atualizar(Curso curso, int novaCargaHoraria, String novaVersao) {
        curso.atualizarPPC(novaCargaHoraria, novaVersao);
        System.out.println("PPC do curso '" + curso.getNome()
                + "' atualizado para versão " + novaVersao);
    }

    public void exibir(Curso curso) {
        System.out.println("curso: "  + curso.getNome());
        System.out.println("versão: " + curso.getVersaoPPC());
        System.out.println("carga:  " + curso.getCargaHoraria() + "h");
    }
}