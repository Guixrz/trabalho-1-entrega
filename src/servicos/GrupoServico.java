package servicos;

import entidades.Grupo;
import entidades.GrupoMembro;

public class GrupoServico {
    
    public void adicionarMembro(Grupo grupo, GrupoMembro membro){
        grupo.getMembros().add(membro); 
    }
}
