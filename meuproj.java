import java.util.List;



public class Vaga {

    // Atributos

    private int id;
    private String titulo;
    private String descricao;
    private String empresa;
    private String localizacao;
    private String requisitos;
   

    // Construtor

    public Vaga(int id, String titulo, String descricao, String empresa, String localizacao, String requisitos, Date dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.empresa = empresa;
        this.localizacao = localizacao;
        this.requisitos = requisitos;
    }


    public class Estudante {
        
        private int id;
        private String nome;
        private String email;
        private String habilidades;
        private String experiencia;
        private String formacaoAcademica;
        private String contato;
    
        // Construtor
        public Estudante(int id, String nome, String email, String habilidades, String experiencia, String formacaoAcademica) {
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.habilidades = habilidades;
            this.experiencia = experiencia;
            this.formacaoAcademica = formacaoAcademica;
            this.contato = contato;
        }


        public class Empresa {

            private int id;
            private String nome;
            private String descricao;
            private String localizacao;
            private String contato;
        
            // Construtor

            public Empresa(int id, String nome, String descricao, String localizacao, String contato) {
                this.id = id;
                this.nome = nome;
                this.descricao = descricao;
                this.localizacao = localizacao;
                this.contato = contato;
            }

        
         

            public class BuscaVagaService {
                // Métodos
                public List<Vaga> buscarVagasPorLocalizacao(String localizacao) {
                    // Lógica para buscar vagas por localização
                    return null; // Retornar a lista de vagas encontradas
                }
            
                public List<Vaga> buscarVagasPorEmpresa(String empresa) {
                    // Lógica para buscar vagas por empresa
                    return null; // Retornar a lista de vagas encontradas
                }
            
                public List<Vaga> buscarVagasPorHabilidade(String habilidade) {
                    // Lógica para buscar vagas por habilidade
                    return null; // Retornar a lista de vagas encontradas
                }
            
                public void criarVaga(Vaga vaga) {
                    // Lógica para criar uma nova vaga
                }
            
                public void atualizarVaga(Vaga vaga) {
                    // Lógica para atualizar uma vaga existente
                }
            
                public void deletarVaga(int idVaga) {
                    // Lógica para deletar uma vaga existente
                }
            }
