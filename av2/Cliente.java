import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
    private int idCliente;
    private String nome;
    private String endereco;
    private String postalCode;
    private String pais;
    private String cpf; // Alterado para String para armazenar corretamente o CPF
    private String passaporte;
    private String email;
    private String dataNascimento;

    // Getters e setters com validações
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCpf() {
        return cpf;
    }

    // Validar e formatar o CPF
    public void setCpf(String cpf) {
        if (validarCPF(cpf)) {
            this.cpf = formatarCPF(cpf);
        } else {
            System.out.println("CPF inválido. Não será definido.");
        }
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Função para validar o CPF
    private boolean validarCPF(String cpf) {
    // Remover pontuações e espaços do CPF
    cpf = cpf.replaceAll("[^0-9]", "");

    // Verificar se o CPF possui 11 dígitos
    if (cpf.length() != 11) {
        return false;
    }

    // Calcular e verificar os dígitos verificadores
    int[] numeros = new int[11];
    for (int i = 0; i < 11; i++) {
        numeros[i] = Character.getNumericValue(cpf.charAt(i));
    }

    // Verificar primeiro dígito verificador
    int soma = 0;
    for (int i = 0; i < 9; i++) {
        soma += numeros[i] * (10 - i);
    }
    int resto = soma % 11;
    int digitoVerificador1 = (resto < 2) ? 0 : (11 - resto);
    if (numeros[9] != digitoVerificador1) {
        return false;
    }

    // Verificar segundo dígito verificador
    soma = 0;
    for (int i = 0; i < 10; i++) {
        soma += numeros[i] * (11 - i);
    }
    resto = soma % 11;
    int digitoVerificador2 = (resto < 2) ? 0 : (11 - resto);
    if (numeros[10] != digitoVerificador2) {
        return false;
    }

    return true;
   }

    private String formatarCPF(String cpf) {
    // Verificar se o CPF é válido antes de formatar
    if (validarCPF(cpf)) {
        // Adicionar pontuações ao CPF
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    } else {
        System.out.println("CPF inválido. Não será formatado.");
        return cpf;
    }
}

}
