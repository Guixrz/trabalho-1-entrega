public class Certificado {
    private String atividade;
    private int cargaHoraria;
    private String instituicaoEmissora;
    private String assinaturaResponsavel;

    public Certificado(String atividade, int cargaHoraria, String instituicaoEmissora, String assinaturaResponsavel) {
        this.atividade = atividade;
        this.cargaHoraria = cargaHoraria;
        this.instituicaoEmissora = instituicaoEmissora;
        this.assinaturaResponsavel = assinaturaResponsavel;
    }

    public String getAtividade() { return atividade; }
    public void setAtividade(String atividade) { this.atividade = atividade; }

    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    public String getInstituicaoEmissora() { return instituicaoEmissora; }
    public void setInstituicaoEmissora(String instituicaoEmissora) { this.instituicaoEmissora = instituicaoEmissora; }

    public String getAssinaturaResponsavel() { return assinaturaResponsavel; }
    public void setAssinaturaResponsavel(String assinaturaResponsavel) { this.assinaturaResponsavel = assinaturaResponsavel; }
}