package cherência;
import java.time.LocalDate;


/**
 * Filipe Lourenço
 * Vitória Piconi
 * Caio Filipi
 */
public class cherência {
    public static void main(String[] args) {
        // TODO code application logic here
                Cadastro novoCadastro = new Cadastro(
            "João",
            939403128,
            "Silva",
            LocalDate.of(2000, 1, 1),
            123456789,
            "A",
            "joao@email.com",
            "Rua Exemplo, 123",
            12345678,
            "Apto 101");
            System.out.println("Nome cadastrado: " + novoCadastro.getNome());
    }
}

class Cadastro {
    private String nome;
    private String sobrenome;
    private LocalDate data_nascimento;
    private int rg;
    private long celular;
    private String categoria;
    private String email;
    private String endereco;
    private int cep;
    private String complemento;

    public Cadastro(String p_nome, long p_celular, String p_sobrenome, LocalDate p_data_nascimento,
                    int p_rg, String p_categoria, String p_email, String p_endereco, int p_cep,
                    String p_complemento) {
        this.nome = p_nome;
        this.sobrenome = p_sobrenome;
        this.data_nascimento = p_data_nascimento;
        this.rg = p_rg;
        this.celular = p_celular;
        this.categoria = p_categoria;
        this.email = p_email;
        this.endereco = p_endereco;
        this.cep = p_cep;
        this.complemento = p_complemento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String p_nome) {
        this.nome = p_nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String p_sobrenome) {
        this.sobrenome = p_sobrenome;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate p_data_nascimento) {
        this.data_nascimento = p_data_nascimento;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int p_rg) {
        this.rg = p_rg;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long p_celular) {
        this.celular = p_celular;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String p_categoria) {
        this.categoria = p_categoria;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String p_email) {
        this.email = p_email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String p_endereco) {
        this.endereco = p_endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int p_cep) {
        this.cep = p_cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String p_complemento) {
        this.complemento = p_complemento;
    }
    
}

