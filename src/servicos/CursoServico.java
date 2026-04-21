package servicos;

import entidades.Curso;

public class CursoServico {

    public void atualizarPPC(int horas, String versao, Curso curso) {
        curso.setCargaHoraria(horas);
        curso.setVersaoPPC(versao);
        
    }
}
